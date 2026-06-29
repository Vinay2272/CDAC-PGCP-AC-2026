import { createStore } from "redux";

const initialState = { list: [] };

function reducer(state = initialState, action) {
  switch (action.type) {
    case "ADD":
      return { list: [...state.list, action.payload] };
    case "DELETE":
      return { list: state.list.filter((_, i) => i !== action.index) };
    default:
      return state;
  }
}

const store = createStore(reducer);
export default store;