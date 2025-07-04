package com.poja.app.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Random;

public class StoredInt {
  private String file_path = "./stored-int.txt";

  public String getStoredInt() {
    File file = new File(file_path);

    try {
      if (file.exists()) {
        // Lire le contenu
        return Files.readString(file.toPath()).trim();
      } else {
        // Créer le fichier et y écrire un entier aléatoire
        int randomInt = new Random().nextInt(10000); // par ex. entre 0 et 9999
        try (FileWriter writer = new FileWriter(file)) {
          writer.write(Integer.toString(randomInt));
        }
        return Integer.toString(randomInt);
      }
    } catch (IOException e) {
      throw new RuntimeException("Erreur de lecture/écriture sur stored-int.txt", e);
    }
  }
}
