package dmit2015.restclient;

import jakarta.inject.Inject;
import jakarta.json.JsonObject;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit5.ArquillianExtension;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.jboss.shrinkwrap.resolver.api.maven.PomEquippedResolveStage;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://eclipse-ee4j.github.io/jsonb-api/docs/user-guide.html
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(ArquillianExtension.class)
public class TodoMpRestClient_ArquillianIT { // The class must be declared as public

    static String mavenArtifactIdId;

    @Deployment
    public static WebArchive createDeployment() throws IOException, XmlPullParserException {
        PomEquippedResolveStage pomFile = Maven.resolver().loadPomFromFile("pom.xml");
        MavenXpp3Reader reader = new MavenXpp3Reader();
        Model model = reader.read(new FileReader("pom.xml"));
        mavenArtifactIdId = model.getArtifactId();
        final String archiveName = model.getArtifactId() + ".war";
        return ShrinkWrap.create(WebArchive.class, archiveName)
                .addAsLibraries(pomFile.resolve("org.codehaus.plexus:plexus-utils:3.4.2").withTransitivity().asFile())
                .addClasses(Todo.class, TodoMpRestClient.class)
//                .addAsManifestResource(new File("src/main/resources/META-INF/microprofile-config.properties"))
                .addAsWebInfResource(new File("src/main/resources/META-INF/beans.xml"));
    }

    @Inject
    @RestClient
    private TodoMpRestClient _todoMpRestClient;

    static String editKey;

    @Order(1)
    @Test
    void shouldFindAll() {
        assertNotNull(_todoMpRestClient);
        // Arrange
        Map<String, Todo> TodoMap = _todoMpRestClient.findAll();
//
        assertEquals(3, TodoMap.size());
        var firstKey = TodoMap.keySet().stream().findFirst().orElseThrow();
        Todo firstTodo = TodoMap.get(firstKey);
        // assertEquals("Expected Property Value", firstTodo.getPropertyName());

        var lastKey = TodoMap.keySet().stream().toList().get(TodoMap.size() - 1);
        Todo lastTodo = TodoMap.get(lastKey);
        // assertEquals("Expected Property Value", lastTodo.getPropertyName());

    }

    @Order(2)
    @Test
    void shouldCreate() {
        // Arrange - you MUST set values for ALL properties of the document
        Todo newTodo = new Todo();
        // newTodo.setPropertyNane("Property Value");

        JsonObject responseObject = _todoMpRestClient.create(newTodo);
        editKey = responseObject.getString("name");
        assertNotNull(editKey);

    }

    @Order(3)
    @Test
    void shouldFineOne() {
        // Arrange and Act
        Todo existingTodo = _todoMpRestClient.findByKey(editKey);

        // Assert
        assertNotNull(existingTodo);
        // assertEquals("Expected Property Value", existingTodo.getPropertyNam());

    }

    @Order(4)
    @Test
    void shouldUpdate() {
        // Arrange
        Todo existingTodo = _todoMpRestClient.findByKey(editKey);
        assertNotNull(existingTodo);
        // Act
        // existingTodo.setPropertyName("Property Value");

        Todo updatedTodo = _todoMpRestClient.update(editKey, existingTodo);
        // Assert
        // assertEquals(existingTodo.getPropertyName(), updatedTodo.getPropertyName());

    }

    @Order(5)
    @Test
    void shouldDelete() {
        // Arrange and Act
        _todoMpRestClient.delete(editKey);
        // Assert
        assertNull(_todoMpRestClient.findByKey(editKey));
    }
}