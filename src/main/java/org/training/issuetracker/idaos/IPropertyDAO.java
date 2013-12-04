package org.training.issuetracker.idaos;

import org.training.issuetracker.beans.issueProperty;

public interface IPropertyDAO {
      public issueProperty read();
      public void write(issueProperty property);
}
