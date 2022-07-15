package seguroscaiserljr;

/********************************************************************************
 ** Form generated from reading ui file 'frmAlta.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.6
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class FrmAlta implements com.trolltech.qt.QUiForm<QDialog>
{
    public QLabel labelCodigo;
    public QLabel labelNombre;
    public QLabel labelApellidos;
    public QLabel labelDireccion;
    public QLabel labelTarifa;
    public QLabel labelTlf;
    public QLabel labelFecha;
    public QLabel labelZona;
    public QLabel labelComercial;
    public QFrame lineUno;
    public QFrame lineDos;
    public QFrame lineTres;
    public QFrame lineCuatro;
    public QGroupBox groupRadio;
    public QRadioButton radioLevante;
    public QRadioButton radioCentro;
    public QRadioButton radioSur;
    public QLineEdit lineCodigo;
    public QLineEdit lineNombre;
    public QLineEdit lineApellidos;
    public QLineEdit lineDireccion;
    public QLineEdit lineTlf;
    public QSpinBox spinTarifa;
    public QDateEdit dateAlta;
    public QPushButton pushAceptarAlta;
    public QPushButton pushCancelarAlta;
    public QGroupBox groupCheck;
    public QCheckBox checkEstrutura;
    public QCheckBox checkCimenta;
    public QCheckBox checkAlbanil;
    public QCheckBox checkFontaneria;
    public QCheckBox checkCarpinteria;
    public QCheckBox checkDeco;
    public QComboBox combocomercial;
    // Inicializamos el MessageBox que informa al usuario de que el registro ha sido aceptado
    // al pulsar el botón aceptar
    private QMessageBox mensajeAlta;

    public FrmAlta() { super(); }

    @Override
    public void setupUi(QDialog dialog)
    {
        dialog.setObjectName("Dialog");
        dialog.setWindowModality(com.trolltech.qt.core.Qt.WindowModality.WindowModal);
        dialog.setEnabled(true);
        dialog.resize(new QSize(692, 694).expandedTo(dialog.minimumSizeHint()));
        labelCodigo = new QLabel(dialog);
        labelCodigo.setObjectName("labelCodigo");
        labelCodigo.setGeometry(new QRect(30, 40, 70, 21));
        labelNombre = new QLabel(dialog);
        labelNombre.setObjectName("labelNombre");
        labelNombre.setGeometry(new QRect(330, 40, 70, 21));
        labelApellidos = new QLabel(dialog);
        labelApellidos.setObjectName("labelApellidos");
        labelApellidos.setGeometry(new QRect(30, 80, 70, 21));
        labelDireccion = new QLabel(dialog);
        labelDireccion.setObjectName("labelDireccion");
        labelDireccion.setGeometry(new QRect(30, 120, 70, 21));
        labelTarifa = new QLabel(dialog);
        labelTarifa.setObjectName("labelTarifa");
        labelTarifa.setGeometry(new QRect(30, 250, 70, 21));
        labelTlf = new QLabel(dialog);
        labelTlf.setObjectName("labelTlf");
        labelTlf.setGeometry(new QRect(330, 80, 171, 21));
        labelFecha = new QLabel(dialog);
        labelFecha.setObjectName("labelFecha");
        labelFecha.setGeometry(new QRect(30, 220, 181, 21));
        labelZona = new QLabel(dialog);
        labelZona.setObjectName("labelZona");
        labelZona.setGeometry(new QRect(40, 370, 70, 21));
        labelComercial = new QLabel(dialog);
        labelComercial.setObjectName("labelComercial");
        labelComercial.setGeometry(new QRect(30, 280, 91, 21));
        lineUno = new QFrame(dialog);
        lineUno.setObjectName("lineUno");
        lineUno.setGeometry(new QRect(100, 180, 531, 20));
        lineUno.setFrameShape(QFrame.Shape.HLine);
        lineDos = new QFrame(dialog);
        lineDos.setObjectName("lineDos");
        lineDos.setGeometry(new QRect(110, 330, 531, 20));
        lineDos.setFrameShape(QFrame.Shape.HLine);
        lineTres = new QFrame(dialog);
        lineTres.setObjectName("lineTres");
        lineTres.setGeometry(new QRect(83, 460, 20, 111));
        lineTres.setFrameShape(QFrame.Shape.VLine);
        lineCuatro = new QFrame(dialog);
        lineCuatro.setObjectName("lineCuatro");
        lineCuatro.setGeometry(new QRect(383, 460, 20, 111));
        lineCuatro.setFrameShape(QFrame.Shape.VLine);
        groupRadio = new QGroupBox(dialog);
        groupRadio.setObjectName("groupRadio");
        groupRadio.setGeometry(new QRect(90, 400, 521, 51));
        radioLevante = new QRadioButton(groupRadio);
        radioLevante.setObjectName("radioLevante");
        radioLevante.setGeometry(new QRect(20, 10, 124, 25));
        radioCentro = new QRadioButton(groupRadio);
        radioCentro.setObjectName("radioCentro");
        radioCentro.setGeometry(new QRect(190, 10, 124, 25));
        radioSur = new QRadioButton(groupRadio);
        radioSur.setObjectName("radioSur");
        radioSur.setGeometry(new QRect(370, 10, 124, 25));
        lineCodigo = new QLineEdit(dialog);
        lineCodigo.setObjectName("lineCodigo");
        lineCodigo.setGeometry(new QRect(130, 40, 113, 27));
        lineCodigo.setMaxLength(5);
        lineNombre = new QLineEdit(dialog);
        lineNombre.setObjectName("lineNombre");
        lineNombre.setGeometry(new QRect(430, 40, 201, 27));
        lineNombre.setMaxLength(10);
        lineApellidos = new QLineEdit(dialog);
        lineApellidos.setObjectName("lineApellidos");
        lineApellidos.setGeometry(new QRect(130, 80, 181, 27));
        lineApellidos.setMaxLength(10);
        lineDireccion = new QLineEdit(dialog);
        lineDireccion.setObjectName("lineDireccion");
        lineDireccion.setGeometry(new QRect(130, 120, 501, 27));
        lineDireccion.setMaxLength(30);
        lineTlf = new QLineEdit(dialog);
        lineTlf.setObjectName("lineTlf");
        lineTlf.setGeometry(new QRect(500, 80, 131, 27));
        lineTlf.setMaxLength(9);
        spinTarifa = new QSpinBox(dialog);
        spinTarifa.setObjectName("spinTarifa");
        spinTarifa.setGeometry(new QRect(150, 250, 54, 27));
        spinTarifa.setMaximum(100);
        spinTarifa.setValue(0);
        dateAlta = new QDateEdit(dialog);
        dateAlta.setObjectName("dateAlta");
        dateAlta.setGeometry(new QRect(150, 220, 110, 27));
        pushAceptarAlta = new QPushButton(dialog);
        pushAceptarAlta.setObjectName("pushAceptarAlta");
        pushAceptarAlta.setGeometry(new QRect(380, 610, 112, 34));
        pushCancelarAlta = new QPushButton(dialog);
        pushCancelarAlta.setObjectName("pushCancelarAlta");
        pushCancelarAlta.setGeometry(new QRect(520, 610, 112, 34));
        mensajeAlta = new QMessageBox(); //Creamos la instancia del mensaje 
        groupCheck = new QGroupBox(dialog);
        groupCheck.setObjectName("groupCheck");
        groupCheck.setGeometry(new QRect(70, 450, 551, 121));
        checkEstrutura = new QCheckBox(groupCheck);
        checkEstrutura.setObjectName("checkEstrutura");
        checkEstrutura.setEnabled(false);
        checkEstrutura.setGeometry(new QRect(60, 10, 104, 25));
        checkCimenta = new QCheckBox(groupCheck);
        checkCimenta.setObjectName("checkCimenta");
        checkCimenta.setEnabled(false);
        checkCimenta.setGeometry(new QRect(60, 50, 141, 25));
        checkAlbanil = new QCheckBox(groupCheck);
        checkAlbanil.setObjectName("checkAlbanil");
        checkAlbanil.setEnabled(false);
        checkAlbanil.setGeometry(new QRect(60, 90, 131, 25));
        checkFontaneria = new QCheckBox(groupCheck);
        checkFontaneria.setObjectName("checkFontaneria");
        checkFontaneria.setEnabled(false);
        checkFontaneria.setGeometry(new QRect(360, 10, 131, 25));
        checkCarpinteria = new QCheckBox(groupCheck);
        checkCarpinteria.setObjectName("checkCarpinteria");
        checkCarpinteria.setEnabled(false);
        checkCarpinteria.setGeometry(new QRect(360, 50, 141, 25));
        checkDeco = new QCheckBox(groupCheck);
        checkDeco.setObjectName("checkDeco");
        checkDeco.setEnabled(false);
        checkDeco.setGeometry(new QRect(360, 90, 131, 25));
        combocomercial = new QComboBox(dialog);
        combocomercial.setObjectName("combocomercial");
        combocomercial.setGeometry(new QRect(150, 280, 161, 27));
        labelCodigo.setBuddy(lineCodigo);
        labelNombre.setBuddy(lineNombre);
        labelApellidos.setBuddy(lineApellidos);
        labelDireccion.setBuddy(lineDireccion);
        labelTarifa.setBuddy(spinTarifa);
        labelTlf.setBuddy(lineTlf);
        labelFecha.setBuddy(dateAlta);
        labelComercial.setBuddy(combocomercial);
        retranslateUi(dialog);
        radioLevante.clicked.connect(checkEstrutura, "setEnabled(boolean)");
        radioLevante.clicked.connect(checkCimenta, "setEnabled(boolean)");
        radioLevante.clicked.connect(checkAlbanil, "setEnabled(boolean)");
        radioLevante.clicked.connect(checkFontaneria, "setEnabled(boolean)");
        radioLevante.clicked.connect(checkCarpinteria, "setEnabled(boolean)");
        radioLevante.clicked.connect(checkDeco, "setEnabled(boolean)");
        radioCentro.clicked.connect(checkAlbanil, "setEnabled(boolean)");
        radioCentro.clicked.connect(checkFontaneria, "setEnabled(boolean)");
        radioCentro.clicked.connect(checkCarpinteria, "setEnabled(boolean)");
        radioCentro.clicked.connect(checkDeco, "setEnabled(boolean)");
        radioSur.clicked.connect(checkAlbanil, "setEnabled(boolean)");
        radioSur.clicked.connect(checkFontaneria, "setEnabled(boolean)");
        radioSur.clicked.connect(checkCarpinteria, "setEnabled(boolean)");
        radioCentro.clicked.connect(checkEstrutura, "setDisabled(boolean)");
        radioCentro.clicked.connect(checkCimenta, "setDisabled(boolean)");
        radioSur.clicked.connect(checkCimenta, "setDisabled(boolean)");
        radioSur.clicked.connect(checkDeco, "setDisabled(boolean)");
        radioSur.clicked.connect(checkEstrutura, "setDisabled(boolean)");
        pushCancelarAlta.clicked.connect(dialog, "close()");
        pushAceptarAlta.clicked.connect(mensajeAlta,"exec()"); //Añadimos la conexión entre el botón Aceptar y el mensaje
        pushAceptarAlta.clicked.connect(dialog, "accept()");
        radioCentro.clicked.connect(checkAlbanil, "setChecked(boolean)");
        radioCentro.clicked.connect(checkFontaneria, "setChecked(boolean)");
        radioCentro.clicked.connect(checkCarpinteria, "setChecked(boolean)");
        radioCentro.clicked.connect(checkDeco, "setChecked(boolean)");
        radioLevante.clicked.connect(checkEstrutura, "setChecked(boolean)");
        radioLevante.clicked.connect(checkCimenta, "setChecked(boolean)");
        radioLevante.clicked.connect(checkAlbanil, "setChecked(boolean)");
        radioLevante.clicked.connect(checkFontaneria, "setChecked(boolean)");
        radioLevante.clicked.connect(checkCarpinteria, "setChecked(boolean)");
        radioLevante.clicked.connect(checkDeco, "setChecked(boolean)");
        radioSur.clicked.connect(checkAlbanil, "setChecked(boolean)");
        radioSur.clicked.connect(checkFontaneria, "setChecked(boolean)");
        radioSur.clicked.connect(checkCarpinteria, "setChecked(boolean)");
        radioLevante.toggled.connect(checkEstrutura, "setChecked(boolean)");
        radioLevante.toggled.connect(checkCimenta, "setChecked(boolean)");
        radioLevante.toggled.connect(checkDeco, "setChecked(boolean)");
        radioCentro.toggled.connect(checkDeco, "setChecked(boolean)");

        dialog.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog dialog)
    {
        dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Nueva alta", null));
        labelCodigo.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "C\u00f3digo", null));
        labelNombre.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Nombre", null));
        labelApellidos.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Apellidos", null));
        labelDireccion.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Direcci\u00f3n", null));
        labelTarifa.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Tarifa", null));
        labelTlf.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Tel\u00e9fono de contacto", null));
        labelFecha.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Fecha de alta", null));
        labelZona.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Zona", null));
        labelComercial.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Comercial", null));
        groupRadio.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Zona de residencia del cliente", null));
        groupRadio.setTitle("");
        radioLevante.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Levante", null));
        radioCentro.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Centro", null));
        radioSur.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Sur", null));
        lineCodigo.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "C\u00f3digo de cliente", null));
        lineNombre.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Nombre del cliente", null));
        lineNombre.setInputMask(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "aaaaaaaaaa; ", null));
        lineApellidos.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Apellidos del cliente", null));
        lineApellidos.setInputMask(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "aaaaaaaaaa; ", null));
        lineDireccion.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Direcci\u00f3n del cliente", null));
        lineTlf.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Tel\u00e9fono del cliente", null));
        lineTlf.setInputMask(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "999999999; ", null));
        spinTarifa.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Tarifa a aplicar", null));
        pushAceptarAlta.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Aceptar", null));
        pushCancelarAlta.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Cancelar", null));
        groupCheck.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Servicios que ha contratado el cliente", null));
        groupCheck.setTitle("");
        checkEstrutura.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Estructura", null));
        checkCimenta.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Cimentaci\u00f3n", null));
        checkAlbanil.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Alba\u00f1iler\u00eda", null));
        checkFontaneria.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Fontaner\u00eda", null));
        checkCarpinteria.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Carpinter\u00eda", null));
        checkDeco.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Decoraci\u00f3n", null));
        combocomercial.clear();
        combocomercial.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "00101", null));
        combocomercial.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "00102", null));
        combocomercial.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "00103", null));
        combocomercial.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "00104", null));
        combocomercial.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "00201", null));
        combocomercial.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "00202", null));
        combocomercial.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "C\u00f3digo del comercial", null));
        //Añadimos el texto y título al mensaje
        mensajeAlta.setText("Has aceptado.");
        mensajeAlta.setWindowTitle("Aceptado");
    } // retranslateUi

}

