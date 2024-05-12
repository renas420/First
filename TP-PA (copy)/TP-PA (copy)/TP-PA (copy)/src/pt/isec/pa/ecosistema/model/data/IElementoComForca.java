package pt.isec.pa.ecosistema.model.data;

public sealed interface IElementoComForca
    permits Fauna, Flora {
    double getForca();
    void setForca(double forca);
}