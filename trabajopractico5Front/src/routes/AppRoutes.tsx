import { Route, Routes } from "react-router-dom"
import Instrumentos from "../components/instrumentos/Instrumentos"
import DetalleInstrumentos from "../components/detalleInstrumentos/DetalleInstrumentos"
import Home from "../components/home/Home"
import DondeEstamos from "../components/dondeEstamos/DondeEstamos"
import GrillaInstrumentos from "../components/grillaInstrumentos/GrillaInstrumentos"
import Formulario from "../components/formulario/Formulario"

const AppRoutes = () => {
  return (
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/products" element={<Instrumentos />} />
        <Route path="/products/detalle/:id" element={<DetalleInstrumentos />}/>
        <Route path="/DondeEstamos" element={<DondeEstamos />} />
        <Route path="/grilla" element={<GrillaInstrumentos />}/>
        <Route path="/formulario/:id" element={<Formulario />}/>
      </Routes>

  )
}

export default AppRoutes