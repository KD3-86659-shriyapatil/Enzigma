import React, { useState } from "react";

const taskData = [
  {
    id: 1,
    user: "User 1",
    status: "Completed",
    dueDate: "12/10/2024",
    priority: "Low",
    comments: "This task is good",
  },
  {
    id: 2,
    user: "User 2",
    status: "In Progress",
    dueDate: "14/09/2024",
    priority: "High",
    comments: "This task is good",
  },
  {
    id: 3,
    user: "User 3",
    status: "Not Started",
    dueDate: "18/08/2024",
    priority: "Low",
    comments: "This task is good",
  },
  {
    id: 4,
    user: "User 4",
    status: "In Progress",
    dueDate: "12/06/2024",
    priority: "Normal",
    comments: "This task is good",
  },
];

export default function TaskTable() {
  const [dropdownId, setDropdownId] = useState(null);

  return (
    <div className="p-4 shadow-md bg-white rounded-lg">
      <div className="flex justify-between items-center mb-4">
        <h2 className="text-xl font-semibold">Tasks</h2>
        <div className="flex gap-2">
          <button className="bg-yellow-200 px-4 py-1 rounded">New Task</button>
          <button className="bg-yellow-200 px-4 py-1 rounded">Refresh</button>
        </div>
      </div>

      <input
        type="text"
        placeholder="Search"
        className="mb-4 p-2 border rounded w-full"
      />

      <table className="w-full border">
        <thead className="bg-gray-100">
          <tr>
            <th></th>
            <th>Assigned To</th>
            <th>Status</th>
            <th>Due Date</th>
            <th>Priority</th>
            <th>Comments</th>
            <th></th>
          </tr>
        </thead>
        <tbody>
          {taskData.map((task) => (
            <tr key={task.id} className="border-t">
              <td>
                <input type="checkbox" />
              </td>
              <td className="text-blue-500 underline cursor-pointer">{task.user}</td>
              <td>{task.status}</td>
              <td>{task.dueDate}</td>
              <td>{task.priority}</td>
              <td>{task.comments}</td>
              <td className="relative">
                <button
                  className="px-2"
                  onClick={() => setDropdownId(dropdownId === task.id ? null : task.id)}
                >
                  ⋮
                </button>
                {dropdownId === task.id && (
                  <div className="absolute right-0 top-full mt-1 bg-yellow-100 shadow rounded">
                    <div className="px-4 py-2 hover:bg-yellow-200 cursor-pointer">Edit</div>
                    <div className="px-4 py-2 hover:bg-yellow-200 cursor-pointer">Delete</div>
                  </div>
                )}
              </td>
            </tr>
          ))}
        </tbody>
      </table>

      <div className="flex justify-between items-center mt-4">
        <select className="border p-1 rounded">
          <option>20</option>
        </select>
        <div className="flex gap-2">
          <button>« First</button>
          <button>‹ Prev</button>
          <span>1</span>
          <button>Next ›</button>
          <button>Last »</button>
        </div>
      </div>
    </div>
  );
}
