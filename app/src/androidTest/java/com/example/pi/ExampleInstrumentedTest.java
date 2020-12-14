package com.example.pi;

import android.content.Context;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.pi.dao.ColetorDAO;
import com.example.pi.dao.ContaDAO;
import com.example.pi.database.AppDatabase;
import com.example.pi.model.Coletor;
import com.example.pi.model.Conta;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    private ColetorDAO coletorDAO;
    private ContaDAO contaDAO;
    private AppDatabase db;

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.pi", appContext.getPackageName());
    }

    @Before
    public void createDB(){
        Context context = ApplicationProvider.getApplicationContext();
        db = Room.inMemoryDatabaseBuilder(context,AppDatabase.class).build();
        coletorDAO = db.coletorDAO();
        contaDAO = db.contaDAO();
    }

    @After
    public void closeDB() throws IOException {
        db.close();
    }

    @Test
    public void getAllVazia(){
        List<Coletor> coletores = new ArrayList<Coletor>();

        coletores = coletorDAO.getAll();

        assertEquals(true, coletores.isEmpty());
    }

    @Test
    public void createCarro() throws Exception{
        Coletor c1 = new Coletor("Coletor 1", 1,"Admin/admin","INSERT INTO PRODUTO (NomeProduto, ValorVenda) VALUES ('Refrigerante', 7.0;");
        Coletor c2 = new Coletor("Coletor 2", 4,"Admin/admin","Insert");
        Coletor c3 = new Coletor("Coletor 3", 2,"Admin/admin","Insert");
        coletorDAO.insert(c1);
        coletorDAO.insert(c2);
        coletorDAO.insert(c3);

        List<Coletor> coletorList = coletorDAO.getAll();

        assertEquals(3, coletorList.size());
    }

    @Test
    public void SetGetNome() throws Exception{
        Coletor c1 = new Coletor("Coletor 1", 1,"Admin/admin","INSERT INTO PRODUTO (NomeProduto, ValorVenda) VALUES ('Refrigerante', 7.0;");
        coletorDAO.insert(c1);

        c1.setNome("Correio");
        assertEquals("Correio", c1.getNome());
    }

    @Test
    public void SetGetQL() throws Exception{
        Coletor c1 = new Coletor("Coletor 1", 1,"Admin/admin","INSERT INTO PRODUTO (NomeProduto, ValorVenda) VALUES ('Refrigerante', 7.0;");
        coletorDAO.insert(c1);

        c1.setQL(6);
        assertEquals(6, c1.getQL());
    }

    @Test
    public void SetGetADB() throws Exception{
        Coletor c1 = new Coletor("Coletor 1", 1,"Admin/admin","INSERT INTO PRODUTO (NomeProduto, ValorVenda) VALUES ('Refrigerante', 7.0;");
        coletorDAO.insert(c1);

        c1.setADB("Admin/senha");
        assertEquals("Admin/senha", c1.getADB());
    }

    @Test
    public void SetGetIDB() throws Exception{
        Coletor c1 = new Coletor("Coletor 1", 1,"Admin/admin","INSERT INTO PRODUTO (NomeProduto, ValorVenda) VALUES ('Refrigerante', 7.0;");
        coletorDAO.insert(c1);

        c1.setIDB("Insert");
        assertEquals("Insert", c1.getIDB());
    }

    @Test
    public void GetColetorById() throws Exception{
        Coletor c1 = new Coletor("Coletor 1", 1,"Admin/admin","INSERT INTO PRODUTO (NomeProduto, ValorVenda) VALUES ('Refrigerante', 7.0;");
        Coletor c2 = new Coletor("Coletor 2", 4,"Admin/admin","Insert");
        Coletor c3 = new Coletor("Coletor 3", 2,"Admin/admin","Insert");
        coletorDAO.insert(c1);
        coletorDAO.insert(c2);
        coletorDAO.insert(c3);

        assertEquals(false, coletorDAO.getAll().isEmpty());
    }

    @Test
    public void DAODelete() throws Exception{
        Coletor c1 = new Coletor("Coletor 1", 1,"Admin/admin","INSERT INTO PRODUTO (NomeProduto, ValorVenda) VALUES ('Refrigerante', 7.0;");
        Coletor c2 = new Coletor("Coletor 2", 4,"Admin/admin","Insert");
        Coletor c3 = new Coletor("Coletor 3", 2,"Admin/admin","Insert");
        coletorDAO.insert(c1);
        coletorDAO.insert(c2);
        coletorDAO.insert(c3);

        assertEquals(1, coletorDAO.delete(c1));
    }

    @Test
    public void criaConta() throws  Exception{
        Conta c1 = new Conta("Ouchi", "123");
        contaDAO.insert(c1);

        assertEquals(true, "Ouchi".equals(c1.getUsuario()));
    }
}