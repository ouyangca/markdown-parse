import static org.junit.Assert.*;
import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
}
// import static org.junit.Assert.*;

// import java.beans.Transient;

// import org.junit.*;

// import java.io.*;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.charset.StandardCharsets;
// import java.util.*;


// public class MarkdownParseTest {
//     @Test
//     public void addition() {
//         assertEquals(2, 1 + 1);
//     }

//     @Test
//     public void readFiles() throws IOException{
//         Path filename = Path.of("test-file.md");
//         String contents = Files.readString(filename);
//         List links = List.of("https://something.com", "some-page.html");
//         assertEquals("checks result", links, MarkdownParse.getLinks(contents));

//         Path filename2 = Path.of("test2_file.md");
//         String contents2 = Files.readString(filename2);
//         List links2 = List.of();
//         assertEquals("checks result 2", links2, MarkdownParse.getLinks(contents2));
//     }


//     // @Test
//     // public void readFiles3() throws IOException{
//     // Path filename3 = Path.of("test-file3.md");
//     // String contents3 = Files.readString(filename3);
//     // List links3 = List.of("www.edwin.com");
//     // assertEquals("checks result 3", links3, MarkdownParse.getLinks(contents3));
//     // }

//     // @Test
//     // public void readFiles4() throws IOException{
//     // Path filename4 = Path.of("test-file4.md");
//     // String contents4 = Files.readString(filename4);
//     // List links4 = List.of("https://CSE15L.com");
//     // assertEquals("checks result 4", links4, MarkdownParse.getLinks(contents4));
//     // }

// }

