public class ControleAcademicoService {

    public String verificarSituacao(double media, int frequencia) {
        if (media >= 7 && frequencia >= 75) {
            return "Aprovado";
        }
        if (media >= 4.0 && media < 7 && frequencia >= 75) {
            return "Prova Final";
        }
        return "Reprovado";
    }

    public double calcularMedia(double nota1, double nota2) {
        // DEFEITO: Falta de parênteses para isolar a operação de soma
        return (nota1 + nota2) / 2.0;
    }

    public boolean frequenciaValida(int frequencia) {
        if (frequencia >= 0 && frequencia <= 100) {
            return true;
        }
        return false;
    }

    public double calcularNotaFinal(double media, double provaFinal) {
        return media + provaFinal / 2;
    }
}