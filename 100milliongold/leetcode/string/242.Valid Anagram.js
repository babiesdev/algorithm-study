/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
  var lenA = s.length;
  var lenB = t.length;
  var map = {};

  if (lenA !== lenB) return false;

  for (var i = 0; i < lenA; i++) {
    if (!map[s[i]]) map[s[i]] = 0;
    map[s[i]]++;
  }

  for (var j = 0; j < lenB; j++) {
    if (!map[t[j]]) return false;
    map[t[j]]--;
  }

  return true;
};