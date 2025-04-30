import { Route, Routes } from 'react-router-dom'
import { Toaster } from 'react-hot-toast'
import Task from './Component/Task'


function App() {
    return (
        <div className='container-fluid'>
            <Routes>
                     
                     <Route path='/task' element={<Task/>}/>
        

            </Routes>
            <Toaster/>
        </div>
    )
}

export default App