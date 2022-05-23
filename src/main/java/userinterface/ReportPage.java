package userinterface;

import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReportPage {
    public static final Target DATE_TABLE = Target.the("where do we select the day to report").located(By.xpath("//span[contains(text(),'2022')]"));
    public static final Target NEW_REPORT = Target.the("button to create a new report").located(By.xpath("//a[@title='Nuevo Detalle Reporte Dia']"));
    public static final Target PROJECT_BUTTON = Target.the("button to input the project").located(By.id("Vertical_v6_MainLayoutEdit_xaf_l128_xaf_dviProyecto_Edit_Find_CD"));
    public static final IFrame POPUP_FRAME = IFrame.withPath(By.xpath("//iframe[starts-with(@id, 'Popup')]"));
    public static final Target PROJECT_INPUT = Target.the("where do we write our project").inIFrame(POPUP_FRAME).located(By.id("Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I"));
    public static final Target PROJECT_SEARCH = Target.the("click to search the project").inIFrame(POPUP_FRAME).located(By.id("Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_B_CD"));
    public static final Target PROJECT_CLICK = Target.the("cell of our project").inIFrame(POPUP_FRAME).located(By.xpath("//span[contains(text(),'CHB1')]"));
    public static final Target HOUR_SELECT = Target.the("display the select of type hours").located(By.id("Vertical_v6_MainLayoutEdit_xaf_l148_xaf_dviTipoHora_Edit_DD_B-1Img"));
    public static final Target HOUR_CLICK = Target.the("Choucair type of hour").located(By.id("Vertical_v6_MainLayoutEdit_xaf_l148_xaf_dviTipoHora_Edit_DD_DDD_L_LBI3T0"));
    public static final Target SERVICE_BUTTON = Target.the("button to input the service").located(By.id("Vertical_v6_MainLayoutEdit_xaf_l153_xaf_dviServicio_Edit_Find_BImg"));
    public static final Target SERVICE_INPUT = Target.the("where do we write the service for search").inIFrame(POPUP_FRAME).located(By.id("Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I"));
    public static final Target SERVICE_SEARCH = Target.the("click to search the project").inIFrame(POPUP_FRAME).located(By.id("Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_B_CD"));
    public static final Target SERVICE_CLICK = Target.the("Pruebas Generales Clásicas service").inIFrame(POPUP_FRAME).located(By.id("Dialog_v9_LE_v10_cell0_0_xaf_Nombre_View"));
    public static final Target ACTIVITY_INPUT = Target.the("where do we write the activity").located(By.id("Vertical_v6_MainLayoutEdit_xaf_l158_xaf_dviActividad_Edit_DD_I"));
    public static final Target ACTIVITY_CLICK = Target.the("Formación Guias activity").located(By.id("Vertical_v6_MainLayoutEdit_xaf_l158_xaf_dviActividad_Edit_DD_DDD_L_LBI38T0"));
    public static final Target TIME_EXECUTED_INPUT = Target.the("where do we write the time executed").located(By.id("Vertical_v6_MainLayoutEdit_xaf_l182_xaf_dviHoras_Edit_I"));
    public static final Target COMMENTARY_INPUT = Target.the("where do we write the commentary of our register").located(By.id("Vertical_v6_MainLayoutEdit_xaf_l207_xaf_dviComentario_Edit_I"));
    public static final Target SAVE_CLOSE_BUTTON = Target.the("button for save and close the report").located(By.id("Vertical_EditModeActions2_Menu_DXI1_T"));
    public static final Target CLOSE_DAY_BUTTON = Target.the("button to close the day to report").located(By.xpath("//a[contains(text(),'Cerrar')]"));
    public static final Target CLOSE_LABEL = Target.the("label to validate report").inIFrame(POPUP_FRAME).located(By.xpath("//td[contains(text(),'Atenci')]"));
}
