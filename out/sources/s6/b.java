package s6;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
class b {

    public interface a<T> {
        void a(T t15, Rect rect);
    }

    /* JADX INFO: renamed from: s6.b$b, reason: collision with other inner class name */
    public interface InterfaceC4562b<T, V> {
        V a(T t15, int i15);

        int b(T t15);
    }

    private static class c<T> implements Comparator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f178205a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f178206b = new Rect();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f178207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final a<T> f178208d;

        c(boolean z15, a<T> aVar) {
            this.f178207c = z15;
            this.f178208d = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t15, T t16) {
            Rect rect = this.f178205a;
            Rect rect2 = this.f178206b;
            this.f178208d.a(t15, rect);
            this.f178208d.a(t16, rect2);
            int i15 = rect.top;
            int i16 = rect2.top;
            if (i15 < i16) {
                return -1;
            }
            if (i15 > i16) {
                return 1;
            }
            int i17 = rect.left;
            int i18 = rect2.left;
            if (i17 < i18) {
                return this.f178207c ? 1 : -1;
            }
            if (i17 > i18) {
                return this.f178207c ? -1 : 1;
            }
            int i19 = rect.bottom;
            int i25 = rect2.bottom;
            if (i19 < i25) {
                return -1;
            }
            if (i19 > i25) {
                return 1;
            }
            int i26 = rect.right;
            int i27 = rect2.right;
            if (i26 < i27) {
                return this.f178207c ? 1 : -1;
            }
            if (i26 > i27) {
                return this.f178207c ? -1 : 1;
            }
            return 0;
        }
    }

    private static boolean a(int i15, Rect rect, Rect rect2, Rect rect3) {
        boolean zB = b(i15, rect, rect2);
        if (b(i15, rect, rect3) || !zB) {
            return false;
        }
        return !j(i15, rect, rect3) || i15 == 17 || i15 == 66 || k(i15, rect, rect2) < m(i15, rect, rect3);
    }

    private static boolean b(int i15, Rect rect, Rect rect2) {
        if (i15 != 17) {
            if (i15 != 33) {
                if (i15 != 66) {
                    if (i15 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static <L, T> T c(L l15, InterfaceC4562b<L, T> interfaceC4562b, a<T> aVar, T t15, Rect rect, int i15) {
        Rect rect2 = new Rect(rect);
        if (i15 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i15 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i15 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i15 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int iB = interfaceC4562b.b(l15);
        Rect rect3 = new Rect();
        T t16 = null;
        for (int i16 = 0; i16 < iB; i16++) {
            T tA = interfaceC4562b.a(l15, i16);
            if (tA != t15) {
                aVar.a(tA, rect3);
                if (h(i15, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t16 = tA;
                }
            }
        }
        return t16;
    }

    public static <L, T> T d(L l15, InterfaceC4562b<L, T> interfaceC4562b, a<T> aVar, T t15, int i15, boolean z15, boolean z16) {
        int iB = interfaceC4562b.b(l15);
        ArrayList arrayList = new ArrayList(iB);
        for (int i16 = 0; i16 < iB; i16++) {
            arrayList.add(interfaceC4562b.a(l15, i16));
        }
        Collections.sort(arrayList, new c(z15, aVar));
        if (i15 == 1) {
            return (T) f(t15, arrayList, z16);
        }
        if (i15 == 2) {
            return (T) e(t15, arrayList, z16);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static <T> T e(T t15, ArrayList<T> arrayList, boolean z15) {
        int size = arrayList.size();
        int iLastIndexOf = (t15 == null ? -1 : arrayList.lastIndexOf(t15)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z15 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static <T> T f(T t15, ArrayList<T> arrayList, boolean z15) {
        int size = arrayList.size();
        int iIndexOf = (t15 == null ? size : arrayList.indexOf(t15)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z15 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int g(int i15, int i16) {
        return (i15 * 13 * i15) + (i16 * i16);
    }

    private static boolean h(int i15, Rect rect, Rect rect2, Rect rect3) {
        if (!i(rect, rect2, i15)) {
            return false;
        }
        if (i(rect, rect3, i15) && !a(i15, rect, rect2, rect3)) {
            return !a(i15, rect, rect3, rect2) && g(k(i15, rect, rect2), o(i15, rect, rect2)) < g(k(i15, rect, rect3), o(i15, rect, rect3));
        }
        return true;
    }

    private static boolean i(Rect rect, Rect rect2, int i15) {
        if (i15 == 17) {
            int i16 = rect.right;
            int i17 = rect2.right;
            return (i16 > i17 || rect.left >= i17) && rect.left > rect2.left;
        }
        if (i15 == 33) {
            int i18 = rect.bottom;
            int i19 = rect2.bottom;
            return (i18 > i19 || rect.top >= i19) && rect.top > rect2.top;
        }
        if (i15 == 66) {
            int i25 = rect.left;
            int i26 = rect2.left;
            return (i25 < i26 || rect.right <= i26) && rect.right < rect2.right;
        }
        if (i15 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i27 = rect.top;
        int i28 = rect2.top;
        return (i27 < i28 || rect.bottom <= i28) && rect.bottom < rect2.bottom;
    }

    private static boolean j(int i15, Rect rect, Rect rect2) {
        if (i15 == 17) {
            return rect.left >= rect2.right;
        }
        if (i15 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i15 == 66) {
            return rect.right <= rect2.left;
        }
        if (i15 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int k(int i15, Rect rect, Rect rect2) {
        return Math.max(0, l(i15, rect, rect2));
    }

    private static int l(int i15, Rect rect, Rect rect2) {
        int i16;
        int i17;
        if (i15 == 17) {
            i16 = rect.left;
            i17 = rect2.right;
        } else if (i15 == 33) {
            i16 = rect.top;
            i17 = rect2.bottom;
        } else if (i15 == 66) {
            i16 = rect2.left;
            i17 = rect.right;
        } else {
            if (i15 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i16 = rect2.top;
            i17 = rect.bottom;
        }
        return i16 - i17;
    }

    private static int m(int i15, Rect rect, Rect rect2) {
        return Math.max(1, n(i15, rect, rect2));
    }

    private static int n(int i15, Rect rect, Rect rect2) {
        int i16;
        int i17;
        if (i15 == 17) {
            i16 = rect.left;
            i17 = rect2.left;
        } else if (i15 == 33) {
            i16 = rect.top;
            i17 = rect2.top;
        } else if (i15 == 66) {
            i16 = rect2.right;
            i17 = rect.right;
        } else {
            if (i15 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i16 = rect2.bottom;
            i17 = rect.bottom;
        }
        return i16 - i17;
    }

    private static int o(int i15, Rect rect, Rect rect2) {
        if (i15 != 17) {
            if (i15 != 33) {
                if (i15 != 66) {
                    if (i15 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
