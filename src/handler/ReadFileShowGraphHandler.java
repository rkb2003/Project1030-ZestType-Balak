
package handler;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

import graph.builder.GModelBuilder;
import util.UtilMsg;
import view.SimpleZestView;
import view.SimpleZestView2;

public class ReadFileShowGraphHandler {
   @Inject
   EPartService service;

   @Execute
   public void execute() {
      SimpleZestView2 zestView = (SimpleZestView2) service.findPart(SimpleZestView2.SIMPLEZESTVIEW_ID).getObject();
      System.out.println("TODO: Class Exercise");
      UtilMsg.openWarning("TODO: Class Exercise");
      //TODO: Class Exercise
      zestView.update(GModelBuilder.instance().buildByGraphInfoFile().getNodes());
   }
}