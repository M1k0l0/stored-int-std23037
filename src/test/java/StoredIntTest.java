import static org.junit.Assert.assertTrue;

import java.io.File;
import org.junit.Test;

public class StoredIntTest {

  @Test
  public void storedIntTest() {
    File file = new File("./stored-int.txt");

    // Vérifie que le fichier existe
    assertTrue("Le fichier stored-int.txt devrait exister", file.exists());
  }
}
