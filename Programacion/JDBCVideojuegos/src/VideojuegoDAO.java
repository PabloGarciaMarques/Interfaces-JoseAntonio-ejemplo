
	import java.sql.*;
	import java.util.ArrayList;
	import java.util.List;

	public class VideojuegoDAO {
	    private Connection conexion;

	    // Constructor
	    public VideojuegoDAO() {
	        this.conexion = conectar();
	    }

	    // Método para establecer la conexión a la base de datos
	    public Connection conectar() {
	        try {
	            // Modifica los detalles de conexión según tu entorno
	            String url = "jdbc:mysql://localhost:3306/VideojuegosDB";
	            String usuario = "root";
	            String contraseña = "rootpablo";

	            return DriverManager.getConnection(url, usuario, contraseña);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Error al conectar a la base de datos");
	        }
	    }

	    // Método para insertar un Videojuego en la base de datos
	    public void insertarVideojuego(Videojuego j) {
	        try {
	            String query = "INSERT INTO videojuego (nombre, fechaLanzamiento, desarrollador, precio, descuento) VALUES (?, ?, ?, ?, ?)";
	            try (PreparedStatement preparedStatement = conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
	                preparedStatement.setString(1, j.getNombre());
	                preparedStatement.setDate(2, j.getFechaLanzamiento());
	                preparedStatement.setString(3, j.getDesarrollador());
	                preparedStatement.setDouble(4, j.getPrecio());
	                preparedStatement.setBoolean(5, j.isDescuento());

	                preparedStatement.executeUpdate();

	                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
	                if (generatedKeys.next()) {
	                    j.setIdVideojuego(generatedKeys.getInt(1));
	                } else {
	                    throw new SQLException("Fallo al obtener el ID del videojuego insertado");
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Error al insertar el videojuego en la base de datos");
	        }
	    }

	    // Método para leer un Videojuego por su ID
	    public Videojuego leerVideojuego(int idVideojuego) {
	        try {
	            String query = "SELECT * FROM videojuego WHERE idVideojuego = ?";
	            try (PreparedStatement preparedStatement = conexion.prepareStatement(query)) {
	                preparedStatement.setInt(1, idVideojuego);

	                try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                    if (resultSet.next()) {
	                        Videojuego videojuego = new Videojuego();
	                        videojuego.setIdVideojuego(resultSet.getInt("idVideojuego"));
	                        videojuego.setNombre(resultSet.getString("nombre"));
	                        videojuego.setFechaLanzamiento(resultSet.getDate("fechaLanzamiento"));
	                        videojuego.setDesarrollador(resultSet.getString("desarrollador"));
	                        videojuego.setPrecio(resultSet.getDouble("precio"));
	                        videojuego.setDescuento(resultSet.getBoolean("descuento"));
	                        return videojuego;
	                    } else {
	                        return null; // No se encontró el videojuego con el ID especificado
	                    }
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Error al leer el videojuego de la base de datos");
	        }
	    }

	    // Método para eliminar un Videojuego por su ID
	    public boolean borrar(int id) {
	        try {
	            String query = "DELETE FROM videojuego WHERE idVideojuego = ?";
	            try (PreparedStatement preparedStatement = conexion.prepareStatement(query)) {
	                preparedStatement.setInt(1, id);
	                int filasAfectadas = preparedStatement.executeUpdate();
	                return filasAfectadas > 0;
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Error al borrar el videojuego de la base de datos");
	        }
	    }

	    // Método para buscar Videojuegos por nombre
	    public List<Videojuego> buscarNombre(String nombre, boolean exacto) {
	        List<Videojuego> resultados = new ArrayList<>();
	        try {
	            String query;
	            if (exacto) {
	                query = "SELECT * FROM videojuego WHERE nombre = ?";
	            } else {
	                query = "SELECT * FROM videojuego WHERE nombre LIKE ?";
	                nombre = "%" + nombre + "%";
	            }

	            try (PreparedStatement preparedStatement = conexion.prepareStatement(query)) {
	                preparedStatement.setString(1, nombre);

	                try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                    while (resultSet.next()) {
	                        Videojuego videojuego = new Videojuego();
	                        videojuego.setIdVideojuego(resultSet.getInt("idVideojuego"));
	                        videojuego.setNombre(resultSet.getString("nombre"));
	                        videojuego.setFechaLanzamiento(resultSet.getDate("fechaLanzamiento"));
	                        videojuego.setDesarrollador(resultSet.getString("desarrollador"));
	                        videojuego.setPrecio(resultSet.getDouble("precio"));
	                        videojuego.setDescuento(resultSet.getBoolean("descuento"));
	                        resultados.add(videojuego);
	                    }
	                }
	            }

	            return resultados;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Error al buscar videojuegos por nombre en la base de datos");
	        }
	    }

	    // Método para buscar Videojuegos por rango de precio
	    public List<Videojuego> buscarPrecio(double min, double max, boolean orden) {
	        List<Videojuego> resultados = new ArrayList<>();
	        try {
	            String query;
	            if (orden) {
	                query = "SELECT * FROM videojuego WHERE precio BETWEEN ? AND ? ORDER BY precio ASC";
	            } else {
	                query = "SELECT * FROM videojuego WHERE precio BETWEEN ? AND ? ORDER BY precio DESC";
	            }

	            try (PreparedStatement preparedStatement = conexion.prepareStatement(query)) {
	                preparedStatement.setDouble(1, min);
	                preparedStatement.setDouble(2, max);

	                try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                    while (resultSet.next()) {
	                        Videojuego videojuego = new Videojuego();
	                        videojuego.setIdVideojuego(resultSet.getInt("idVideojuego"));
	                        videojuego.setNombre(resultSet.getString("nombre"));
	                        videojuego.setFechaLanzamiento(resultSet.getDate("fechaLanzamiento"));
	                        videojuego.setDesarrollador(resultSet.getString("desarrollador"));
	                        videojuego.setPrecio(resultSet.getDouble("precio"));
	                        videojuego.setDescuento(resultSet.getBoolean("descuento"));
	                        resultados.add(videojuego);
	                    }
	                }
	            }

	            return resultados;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Error al buscar videojuegos por rango de precio en la base de datos");
	        }
	    }
	}


