    public List<T> getEntriesForXValue(float f) {
        ?? r5;
        ArrayList $r5 = new ArrayList();
        List $r2 = this.mValues;
        int $i0 = $r2.size();
        int $i1 = $i0 - 1;
        int $i2 = 0;
        while (true) {
            if ($i2 > $i1) {
                break;
            }
            androidintSinkClass.intsinkMet($i2);
            androidintSinkClass.intsinkMet($i1);
            androidbyteSinkClass.bytesinkMet(r5);
            androidintSinkClass.intsinkMet(0);
            int $i02 = $i1 + $i2;
            int $i03 = $i02 / 2;
            List $r22 = this.mValues;
            Object $r3 = $r22.get($i03);
            Entry $r4 = (Entry) $r3;
            float $f1 = $r4.getX();
            ?? r52 = (f > $f1 ? 1 : (f == $f1 ? 0 : -1));
            if (r52 == 0) {
                while ($i03 > 0) {
                    androidintSinkClass.intsinkMet($i03);
                    androidintSinkClass.intsinkMet(0);
                    androidbyteSinkClass.bytesinkMet(r52);
                    androidintSinkClass.intsinkMet(0);
                    List $r23 = this.mValues;
                    int $i22 = $i03 - 1;
                    Object $r32 = $r23.get($i22);
                    float $f12 = ((Entry) $r32).getX();
                    r52 = ($f12 > f ? 1 : ($f12 == f ? 0 : -1));
                    if (r52 != 0) {
                        break;
                    }
                    $i03--;
                }
                List $r24 = this.mValues;
                int $i23 = $r24.size();
                byte $b3 = r52;
                while ($i03 < $i23) {
                    androidbyteSinkClass.bytesinkMet($b3);
                    androidintSinkClass.intsinkMet(0);
                    androidintSinkClass.intsinkMet($i03);
                    androidintSinkClass.intsinkMet($i23);
                    List $r25 = this.mValues;
                    Object $r33 = $r25.get($i03);
                    T t = (Entry) $r33;
                    float $f13 = t.getX();
                    int i = ($f13 > f ? 1 : ($f13 == f ? 0 : -1));
                    if (i != 0) {
                        break;
                    }
                    $r5.add(t);
                    $i03++;
                    $b3 = i;
                }
            } else {
                float $f14 = $r4.getX();
                r5 = (f > $f14 ? 1 : (f == $f14 ? 0 : -1));
                if (r5 > 0) {
                    $i2 = $i03 + 1;
                } else {
                    $i1 = $i03 - 1;
                }
            }
        }
        return $r5;
    }
