/*
 * Copyright 2015 RandomAltThing (@TheDiamondYT)
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
package org.mineserver.entity;

public interface Player{
	
	public String getName();
	
	public String getDisplayName();
	
	public void setDisplayName(String displayName);
	
	public void kick(String reason);
	
	public void ban(String reason);
	
	public void sendMessage(String message); //Single message
	
	public void sendMessage(String[] message); //multiple messages
	
}