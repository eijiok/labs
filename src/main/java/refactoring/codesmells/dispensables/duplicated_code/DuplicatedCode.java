package refactoring.codesmells.dispensables.duplicated_code;

/**
 * Como refatorar:
 * 1. Na mesma classe
 * - Extraia o método
 *
 * 2. Em classes irmãs
 * - Extraia o método nas classes e puxe para a classe mãe
 * - Se o método não for identico, use Formatar em Método Template
 * - Se fizer a mesma coisa de maneiras diferentes, Substitua o Algorítmo pelo mellhor
 *
 * 3. Em classes não relacionadas
 * - Veja de quem realmente deve ser a classe.
 *
 * 3.1 Ou Extraia a Classe de uma e use como componente na outra
 * 3.2 Ou deixe em uma classe e use em outra
 *
 */
public class DuplicatedCode {
}
