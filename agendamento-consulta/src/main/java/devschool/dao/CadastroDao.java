package devschool.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import devschool.jdbc.connection.Conexao;
import devschool.model.Cadastro;

public class CadastroDao {
	
	private Connection cnn;
	
	public CadastroDao() {
		Conexao con = new Conexao();
		cnn = con.criarConexao();
	}
	
	public void incluir(Cadastro cadastro) {
		try {
		String insert = "INSERT INTO public.tab_clientes (razao_nome,telefone ) VALUES (?,?);";
		PreparedStatement st = cnn.prepareStatement(insert);
		st.setString(1, cadastro.getRazao_nome());
		st.setLong(2, cadastro.getTelefone());
		st.execute();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void excluir(Integer cod) {
		try {
			String delete = "DELETE from public.tab_clientes where codigo = ?";
			PreparedStatement st = cnn.prepareStatement(delete);
			st.setInt(1, cod);
			st.executeUpdate();
			st.close();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterar (Cadastro cadastro) {
		try {
			String sql = "UPDATE public.tab_clientes SET razao_nome = ?, telefone =? where codigo = ?";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setString(1, cadastro.getRazao_nome());
			st.setLong(2, cadastro.getTelefone());
			st.setInt(3, cadastro.getCodigo());
			st.executeUpdate();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Cadastro> listar(){
		List<Cadastro> lista = new ArrayList<Cadastro>();
		try {
			String sql = "SELECT codigo, razao_nome,telefone from public.tab_clientes";
			
			PreparedStatement st = cnn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Cadastro cliente = new Cadastro();
				cliente.setCodigo(rs.getInt("codigo"));
				cliente.setRazao_nome(rs.getString("razao_nome"));
				cliente.setTelefone(rs.getLong("telefone"));
				lista.add(cliente);
			}
			st.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public Cadastro buscar (Integer cod) {
		Cadastro cadastro = null;
		try {
			String sql = "SELECT * from public.tab_clientes WHERE codigo = ?";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setInt(1, cod);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				cadastro = new Cadastro();
				cadastro.setCodigo(rs.getInt("cod"));
				cadastro.setRazao_nome(rs.getString("razao_nome"));
				cadastro.setTelefone(rs.getLong("telefone"));
			}
			st.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return cadastro;
	}

}
