package pl.krzysiekgl;

import java.util.ArrayList;

public interface ISaveable {
  ArrayList<String> saveValues();
  void loadValues(ArrayList<String> values);
}
