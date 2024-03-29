package com.shadowblockz.eggemall.utilities;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.bukkit.entity.Player;

public class MapUtil 
{
  /**
   * Sorts the specified hashmap in order of value
   * (high to low)
   * @param map the specified hashmap.
   * @return the sorted hashmap.
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public static Map<Player, Integer> sortByValue(Map<Player, Integer> map) 
  {
    List list = new LinkedList(map.entrySet());    
    Collections.sort(list, new Comparator() 
    {     
      public int compare(Object o1, Object o2) 
      {         
        return ((Comparable) ((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry) (o1)).getValue());
      }
    }
    );  

    Map result = new LinkedHashMap();    
    for (Iterator it = list.iterator(); it.hasNext();) 
    { 
      Map.Entry entry = (Map.Entry)it.next();   
      result.put(entry.getKey(), entry.getValue());    
    }     
    
    return result;    
  }
}
