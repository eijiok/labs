package refactoring.codesmells.dispensables.dataclass;

/**
 * Classes com campos e métodos acessores.
 * Não usam toda a capacidade de OO
 *
 * Como refatorar:
 * - Encapsule campos públicos com métodos acessores
 * - Encapsule campos coleções
 * - Remova os setters de cada campo que não pode ser alterado
 *
 * - Olhe para os Getters e Setters que são usados em outras classes
 * - Mova o método de comportamento para a classe, extraia o método se necessário
 * - Esconda os métodos acessores quando possível
 */
public class DataClass {
}
