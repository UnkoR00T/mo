package androidx.recyclerview.widget;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f13406a;

    interface a {
        androidx.recyclerview.widget.a.b a(int i15, int i16, int i17, Object obj);

        void b(androidx.recyclerview.widget.a.b bVar);
    }

    o(a aVar) {
        this.f13406a = aVar;
    }

    private int a(List<androidx.recyclerview.widget.a.b> list) {
        boolean z15 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f13222a != 8) {
                z15 = true;
            } else if (z15) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<androidx.recyclerview.widget.a.b> list, int i15, androidx.recyclerview.widget.a.b bVar, int i16, androidx.recyclerview.widget.a.b bVar2) {
        int i17 = bVar.f13225d;
        int i18 = bVar2.f13223b;
        int i19 = i17 < i18 ? -1 : 0;
        int i25 = bVar.f13223b;
        if (i25 < i18) {
            i19++;
        }
        if (i18 <= i25) {
            bVar.f13223b = i25 + bVar2.f13225d;
        }
        int i26 = bVar2.f13223b;
        if (i26 <= i17) {
            bVar.f13225d = i17 + bVar2.f13225d;
        }
        bVar2.f13223b = i26 + i19;
        list.set(i15, bVar2);
        list.set(i16, bVar);
    }

    private void d(List<androidx.recyclerview.widget.a.b> list, int i15, int i16) {
        androidx.recyclerview.widget.a.b bVar = list.get(i15);
        androidx.recyclerview.widget.a.b bVar2 = list.get(i16);
        int i17 = bVar2.f13222a;
        if (i17 == 1) {
            c(list, i15, bVar, i16, bVar2);
        } else if (i17 == 2) {
            e(list, i15, bVar, i16, bVar2);
        } else {
            if (i17 != 4) {
                return;
            }
            f(list, i15, bVar, i16, bVar2);
        }
    }

    void b(List<androidx.recyclerview.widget.a.b> list) {
        while (true) {
            int iA = a(list);
            if (iA == -1) {
                return;
            } else {
                d(list, iA, iA + 1);
            }
        }
    }

    void e(List<androidx.recyclerview.widget.a.b> list, int i15, androidx.recyclerview.widget.a.b bVar, int i16, androidx.recyclerview.widget.a.b bVar2) {
        boolean z15;
        int i17 = bVar.f13223b;
        int i18 = bVar.f13225d;
        boolean z16 = false;
        if (i17 < i18) {
            if (bVar2.f13223b == i17 && bVar2.f13225d == i18 - i17) {
                z15 = false;
                z16 = true;
            } else {
                z15 = false;
            }
        } else if (bVar2.f13223b == i18 + 1 && bVar2.f13225d == i17 - i18) {
            z15 = true;
            z16 = true;
        } else {
            z15 = true;
        }
        int i19 = bVar2.f13223b;
        if (i18 < i19) {
            bVar2.f13223b = i19 - 1;
        } else {
            int i25 = bVar2.f13225d;
            if (i18 < i19 + i25) {
                bVar2.f13225d = i25 - 1;
                bVar.f13222a = 2;
                bVar.f13225d = 1;
                if (bVar2.f13225d == 0) {
                    list.remove(i16);
                    this.f13406a.b(bVar2);
                    return;
                }
                return;
            }
        }
        int i26 = bVar.f13223b;
        int i27 = bVar2.f13223b;
        androidx.recyclerview.widget.a.b bVarA = null;
        if (i26 <= i27) {
            bVar2.f13223b = i27 + 1;
        } else {
            int i28 = bVar2.f13225d;
            if (i26 < i27 + i28) {
                bVarA = this.f13406a.a(2, i26 + 1, (i27 + i28) - i26, null);
                bVar2.f13225d = bVar.f13223b - bVar2.f13223b;
            }
        }
        if (z16) {
            list.set(i15, bVar2);
            list.remove(i16);
            this.f13406a.b(bVar);
            return;
        }
        if (z15) {
            if (bVarA != null) {
                int i29 = bVar.f13223b;
                if (i29 > bVarA.f13223b) {
                    bVar.f13223b = i29 - bVarA.f13225d;
                }
                int i35 = bVar.f13225d;
                if (i35 > bVarA.f13223b) {
                    bVar.f13225d = i35 - bVarA.f13225d;
                }
            }
            int i36 = bVar.f13223b;
            if (i36 > bVar2.f13223b) {
                bVar.f13223b = i36 - bVar2.f13225d;
            }
            int i37 = bVar.f13225d;
            if (i37 > bVar2.f13223b) {
                bVar.f13225d = i37 - bVar2.f13225d;
            }
        } else {
            if (bVarA != null) {
                int i38 = bVar.f13223b;
                if (i38 >= bVarA.f13223b) {
                    bVar.f13223b = i38 - bVarA.f13225d;
                }
                int i39 = bVar.f13225d;
                if (i39 >= bVarA.f13223b) {
                    bVar.f13225d = i39 - bVarA.f13225d;
                }
            }
            int i45 = bVar.f13223b;
            if (i45 >= bVar2.f13223b) {
                bVar.f13223b = i45 - bVar2.f13225d;
            }
            int i46 = bVar.f13225d;
            if (i46 >= bVar2.f13223b) {
                bVar.f13225d = i46 - bVar2.f13225d;
            }
        }
        list.set(i15, bVar2);
        if (bVar.f13223b != bVar.f13225d) {
            list.set(i16, bVar);
        } else {
            list.remove(i16);
        }
        if (bVarA != null) {
            list.add(i15, bVarA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    void f(List<androidx.recyclerview.widget.a.b> list, int i15, androidx.recyclerview.widget.a.b bVar, int i16, androidx.recyclerview.widget.a.b bVar2) {
        androidx.recyclerview.widget.a.b bVarA;
        int i17;
        int i18;
        int i19;
        int i25 = bVar.f13225d;
        int i26 = bVar2.f13223b;
        androidx.recyclerview.widget.a.b bVarA2 = null;
        if (i25 >= i26) {
            int i27 = bVar2.f13225d;
            if (i25 < i26 + i27) {
                bVar2.f13225d = i27 - 1;
                bVarA = this.f13406a.a(4, bVar.f13223b, 1, bVar2.f13224c);
            }
            i17 = bVar.f13223b;
            i18 = bVar2.f13223b;
            if (i17 <= i18) {
                bVar2.f13223b = i18 + 1;
            } else {
                i19 = bVar2.f13225d;
                if (i17 < i18 + i19) {
                    int i28 = (i18 + i19) - i17;
                    bVarA2 = this.f13406a.a(4, i17 + 1, i28, bVar2.f13224c);
                    bVar2.f13225d -= i28;
                }
            }
            list.set(i16, bVar);
            if (bVar2.f13225d > 0) {
                list.set(i15, bVar2);
            } else {
                list.remove(i15);
                this.f13406a.b(bVar2);
            }
            if (bVarA != null) {
                list.add(i15, bVarA);
            }
            if (bVarA2 != null) {
                list.add(i15, bVarA2);
            }
        }
        bVar2.f13223b = i26 - 1;
        bVarA = null;
        i17 = bVar.f13223b;
        i18 = bVar2.f13223b;
        if (i17 <= i18) {
            bVar2.f13223b = i18 + 1;
        } else {
            i19 = bVar2.f13225d;
            if (i17 < i18 + i19) {
                int i29 = (i18 + i19) - i17;
                bVarA2 = this.f13406a.a(4, i17 + 1, i29, bVar2.f13224c);
                bVar2.f13225d -= i29;
            }
        }
        list.set(i16, bVar);
        if (bVar2.f13225d > 0) {
            list.set(i15, bVar2);
        } else {
            list.remove(i15);
            this.f13406a.b(bVar2);
        }
        if (bVarA != null) {
            list.add(i15, bVarA);
        }
        if (bVarA2 != null) {
            list.add(i15, bVarA2);
        }
    }
}
