import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class worldShould {

    @Test
    void world_is_empty() {
        World world = new World();
        assertThat(world.isEmpty()).isTrue();
    }

    @Test
    void to_have_any_cell_alive() {
        World world = new World();
        Cell cell = new Cell(1);
        world.addCell(cell, 0, 0);
        assertThat(world.isEmpty()).isFalse();
    }

    @Test
    void count_alive_cells() {
        World world = new World();
        Cell cell = new Cell(1);
        Cell cell1 = new Cell(1);
        world.addCell(cell, 0, 0);
        world.addCell(cell1, 0, 1);
        assertThat(world.countAliveCells()).isEqualTo(2);
    }
}
