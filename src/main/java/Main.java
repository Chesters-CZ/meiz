import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL33;

import java.util.concurrent.TimeUnit;

import static org.lwjgl.opengl.GL11.GL_TRIANGLES;
import static org.lwjgl.opengl.GL11.glDrawArrays;

public class Main {
    public static void main(String[] Args) throws Exception {

        GLFW.glfwInit();

        GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MAJOR, 3);
        GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MINOR, 3);

        long window = GLFW.glfwCreateWindow(540, 540, "Sample text", 0, 0);
        if (window == 0) {
            GLFW.glfwTerminate();
            throw new Exception("o shit. where window?");
        }
        GLFW.glfwMakeContextCurrent(window);

        GL.createCapabilities();
        GL33.glViewport(0, 0, 540, 540);

        // It's beautiful!
        float r = 0;
        float g = 0;
        float b = 0;

        Game.init(window);
        while (!GLFW.glfwWindowShouldClose(window)) {

            if (GLFW.glfwGetKey(window, GLFW.GLFW_KEY_ESCAPE) == GLFW.GLFW_PRESS)
                GLFW.glfwSetWindowShouldClose(window, true);

            if (GLFW.glfwGetKey(window, GLFW.GLFW_KEY_SPACE) == GLFW.GLFW_PRESS) {
                r += Math.random() * 0.1;
                g += Math.random() * 0.1;
                b += Math.random() * 0.1;
                if (r > 50) r -= 50;
                if (g > 50) g -= 50;
                if (b > 50) b -= 50;

                System.out.println("r = " + r + ", g = " + g + ", b = " + b);

                GL33.glClearColor(r % 1, g % 1, b % 1, 1f);
                GL33.glClear(GL33.GL_COLOR_BUFFER_BIT);
                GLFW.glfwSwapBuffers(window);
                GL33.glClearColor(r % 1, g % 1, b % 1, 1f);
                GL33.glClear(GL33.GL_COLOR_BUFFER_BIT);
            }
            GL33.glClearColor(0f, 0f, 0f, 1f);
            GL33.glClear(GL33.GL_COLOR_BUFFER_BIT);
            Game.render(window);
            Game.update(window);
            System.out.println("did stuff");
            GLFW.glfwSwapBuffers(window);
            GLFW.glfwPollEvents();
        }

        GLFW.glfwTerminate();
    }

}
