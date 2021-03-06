/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import { ActionType, UserViewport, ViewportAction } from './types';
import moment from "moment";


export const initialViewportState: UserViewport = {
  isDirty: false,
  center: [0, 0],
  zoom: 2,
  userTimelineViewPort: {
    defaultTimeStart: moment().startOf("day").toDate(),
    defaultTimeEnd: moment().startOf("day").add(360, "day").toDate(),
  }
};

const clientReducer = (state = initialViewportState, action: ViewportAction): UserViewport => {
  switch (action.type) {
    case ActionType.UPDATE_VIEWPORT: {
     if (!action.value || !action.value.zoom || !action.value.center || !action.value.userTimelineViewPort) return state;
     console.log("Client Reducer - UPDATE VIEWPORT - : "+action.value.userTimelineViewPort)
      return { isDirty: true, zoom: action.value.zoom, center: action.value.center, userTimelineViewPort: action.value.userTimelineViewPort };
    }
    case ActionType.RESET_VIEWPORT: {
      return initialViewportState;
    }
    default:
      return state;
  }
};

export default clientReducer;
