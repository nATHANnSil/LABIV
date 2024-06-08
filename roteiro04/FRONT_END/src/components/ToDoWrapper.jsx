import React from 'react';
import {TodoForm} from './ToDoForm';
import { TodoList } from './ToDoList';

export const TodoForm = () => {
    return (
        <div className='TodoWrapper'>
            <h1>Lista de Tarefas</h1>
            <TodoForm />
            <TodoList />
        </div>
    );
}