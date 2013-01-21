package org.jbehave.eclipse.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenerateStepsWizard extends Wizard implements INewWizard {
	private static Logger log = LoggerFactory.getLogger(GenerateStepsWizard.class);
	
	private SelectStepsToGenerateWizardPage page;
	private IStructuredSelection selection;
	
	public GenerateStepsWizard() {
		super();
		setWindowTitle(WizardsMessages.NewStoryWizardPageTitle);
		log.debug("GenerateStepsWizard()");
	}
	
	public void addPages() {
		page = new SelectStepsToGenerateWizardPage(selection);
		addPage(page);
	}
	
	//private void openEditor(final IFile file){
	//		if(file != null){
	//		getShell().getDisplay().asyncExec(new Runnable(){
	//			public void run(){
	//				try{
	//					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
	//					IDE.openEditor(page, file,true);
	//				}catch( PartInitException e){
	//					log.debug(e.getMessage(), e);
	//				}
	//			}
	//		});
	//	}
	//}

	public boolean performFinish() {
		boolean performedOK = false;
		
//		IFile file = page.createNewFile();
//		if(file != null)
//		{
//			// open the file in editor
//			openEditor(file);
//			
//			// everything is fine
//			performedOK = true;
//		}
		return performedOK;
	}
	
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}