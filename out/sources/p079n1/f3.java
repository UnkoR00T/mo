package p079n1;

import android.view.KeyEvent;
import p071kotlin.Metadata;
import y3.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ln1/h3;", "systemShortcutModifiers", "Ln1/e3;", "a", "(I)Ln1/e3;", "Ln1/e3;", "b", "()Ln1/e3;", "defaultKeyMapping", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e3 f130027a = new b(a(h3.INSTANCE.c()));

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"n1/f3$a", "Ln1/e3;", "Ly3/b;", "event", "Ln1/c3;", "a", "(Landroid/view/KeyEvent;)Ln1/c3;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements e3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f130028a;

        a(int i15) {
            this.f130028a = i15;
        }

        @Override // p079n1.e3
        public c3 a(KeyEvent event) {
            int iA = i3.a(event);
            int i15 = this.f130028a;
            h3.Companion companion = h3.INSTANCE;
            if (h3.j(iA, h3.k(i15, companion.f()))) {
                if (y3.a.R(d.a(event), y3.a.INSTANCE.N())) {
                    return c3.REDO;
                }
                return null;
            }
            if (h3.j(iA, this.f130028a)) {
                long jA = d.a(event);
                y3.a.Companion companion2 = y3.a.INSTANCE;
                if (y3.a.R(jA, companion2.e()) || y3.a.R(jA, companion2.q()) || y3.a.R(jA, companion2.A())) {
                    return c3.COPY;
                }
                if (y3.a.R(jA, companion2.K())) {
                    return c3.PASTE;
                }
                if (y3.a.R(jA, companion2.L())) {
                    return c3.CUT;
                }
                if (y3.a.R(jA, companion2.a())) {
                    return c3.SELECT_ALL;
                }
                if (y3.a.R(jA, companion2.M())) {
                    return c3.REDO;
                }
                if (y3.a.R(jA, companion2.N())) {
                    return c3.UNDO;
                }
                return null;
            }
            if (h3.j(iA, companion.f())) {
                long jA2 = d.a(event);
                y3.a.Companion companion3 = y3.a.INSTANCE;
                if (y3.a.R(jA2, companion3.k()) || y3.a.R(jA2, companion3.w())) {
                    return c3.SELECT_LEFT_CHAR;
                }
                if (y3.a.R(jA2, companion3.l()) || y3.a.R(jA2, companion3.x())) {
                    return c3.SELECT_RIGHT_CHAR;
                }
                if (y3.a.R(jA2, companion3.m()) || y3.a.R(jA2, companion3.y())) {
                    return c3.SELECT_UP;
                }
                if (y3.a.R(jA2, companion3.j()) || y3.a.R(jA2, companion3.v())) {
                    return c3.SELECT_DOWN;
                }
                if (y3.a.R(jA2, companion3.G()) || y3.a.R(jA2, companion3.E())) {
                    return c3.SELECT_PAGE_UP;
                }
                if (y3.a.R(jA2, companion3.F()) || y3.a.R(jA2, companion3.D())) {
                    return c3.SELECT_PAGE_DOWN;
                }
                if (y3.a.R(jA2, companion3.s()) || y3.a.R(jA2, companion3.C())) {
                    return c3.SELECT_LINE_START;
                }
                if (y3.a.R(jA2, companion3.r()) || y3.a.R(jA2, companion3.B())) {
                    return c3.SELECT_LINE_END;
                }
                if (y3.a.R(jA2, companion3.q()) || y3.a.R(jA2, companion3.A())) {
                    return c3.PASTE;
                }
                return null;
            }
            if (!h3.j(iA, companion.e())) {
                return null;
            }
            long jA3 = d.a(event);
            y3.a.Companion companion4 = y3.a.INSTANCE;
            if (y3.a.R(jA3, companion4.k()) || y3.a.R(jA3, companion4.w())) {
                return c3.LEFT_CHAR;
            }
            if (y3.a.R(jA3, companion4.l()) || y3.a.R(jA3, companion4.x())) {
                return c3.RIGHT_CHAR;
            }
            if (y3.a.R(jA3, companion4.m()) || y3.a.R(jA3, companion4.y())) {
                return c3.UP;
            }
            if (y3.a.R(jA3, companion4.j()) || y3.a.R(jA3, companion4.v())) {
                return c3.DOWN;
            }
            if (y3.a.R(jA3, companion4.i())) {
                return c3.CENTER;
            }
            if (y3.a.R(jA3, companion4.G()) || y3.a.R(jA3, companion4.E())) {
                return c3.PAGE_UP;
            }
            if (y3.a.R(jA3, companion4.F()) || y3.a.R(jA3, companion4.D())) {
                return c3.PAGE_DOWN;
            }
            if (y3.a.R(jA3, companion4.s()) || y3.a.R(jA3, companion4.C())) {
                return c3.LINE_START;
            }
            if (y3.a.R(jA3, companion4.r()) || y3.a.R(jA3, companion4.B())) {
                return c3.LINE_END;
            }
            if (y3.a.R(jA3, companion4.n()) || y3.a.R(jA3, companion4.z())) {
                return c3.NEW_LINE;
            }
            if (y3.a.R(jA3, companion4.d())) {
                return c3.DELETE_PREV_CHAR;
            }
            if (y3.a.R(jA3, companion4.h())) {
                return c3.DELETE_NEXT_CHAR;
            }
            if (y3.a.R(jA3, companion4.H())) {
                return c3.PASTE;
            }
            if (y3.a.R(jA3, companion4.g())) {
                return c3.CUT;
            }
            if (y3.a.R(jA3, companion4.f())) {
                return c3.COPY;
            }
            if (y3.a.R(jA3, companion4.J())) {
                return c3.TAB;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"n1/f3$b", "Ln1/e3;", "Ly3/b;", "event", "Ln1/c3;", "a", "(Landroid/view/KeyEvent;)Ln1/c3;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements e3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e3 f130029a;

        b(e3 e3Var) {
            this.f130029a = e3Var;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004b  */
        @Override // p079n1.e3
        public c3 a(KeyEvent event) {
            c3 c3Var;
            int iA = i3.a(event);
            long jA = d.a(event);
            y3.a.Companion companion = y3.a.INSTANCE;
            c3 c3Var2 = null;
            if (y3.a.R(jA, companion.d())) {
                h3.Companion companion2 = h3.INSTANCE;
                if (h3.j(iA, companion2.e()) || h3.j(iA, companion2.f()) || h3.j(iA, companion2.g())) {
                    c3Var = c3.DELETE_PREV_CHAR;
                } else if (h3.j(iA, companion2.c()) || h3.j(iA, companion2.d())) {
                    c3Var = c3.DELETE_PREV_WORD;
                } else {
                    c3Var = null;
                }
            } else if (y3.a.R(jA, companion.n()) || y3.a.R(jA, companion.z())) {
                h3.Companion companion3 = h3.INSTANCE;
                if (h3.j(iA, companion3.e()) || h3.j(iA, companion3.f()) || h3.j(iA, companion3.c()) || h3.j(iA, companion3.d())) {
                    c3Var = c3.NEW_LINE;
                } else {
                    c3Var = null;
                }
            } else {
                c3Var = null;
            }
            if (c3Var != null) {
                return c3Var;
            }
            int iA2 = i3.a(event);
            h3.Companion companion4 = h3.INSTANCE;
            if (h3.j(iA2, companion4.d())) {
                long jA2 = d.a(event);
                if (y3.a.R(jA2, companion.k()) || y3.a.R(jA2, companion.w())) {
                    c3Var2 = c3.SELECT_LEFT_WORD;
                } else if (y3.a.R(jA2, companion.l()) || y3.a.R(jA2, companion.x())) {
                    c3Var2 = c3.SELECT_RIGHT_WORD;
                } else if (y3.a.R(jA2, companion.m()) || y3.a.R(jA2, companion.y())) {
                    c3Var2 = c3.SELECT_PREV_PARAGRAPH;
                } else if (y3.a.R(jA2, companion.j()) || y3.a.R(jA2, companion.v())) {
                    c3Var2 = c3.SELECT_NEXT_PARAGRAPH;
                }
            } else if (h3.j(iA2, companion4.c())) {
                long jA3 = d.a(event);
                if (y3.a.R(jA3, companion.k()) || y3.a.R(jA3, companion.w())) {
                    c3Var2 = c3.LEFT_WORD;
                } else if (y3.a.R(jA3, companion.l()) || y3.a.R(jA3, companion.x())) {
                    c3Var2 = c3.RIGHT_WORD;
                } else if (y3.a.R(jA3, companion.m()) || y3.a.R(jA3, companion.y())) {
                    c3Var2 = c3.PREV_PARAGRAPH;
                } else if (y3.a.R(jA3, companion.j()) || y3.a.R(jA3, companion.v())) {
                    c3Var2 = c3.NEXT_PARAGRAPH;
                } else if (y3.a.R(jA3, companion.p())) {
                    c3Var2 = c3.DELETE_PREV_CHAR;
                } else if (y3.a.R(jA3, companion.h())) {
                    c3Var2 = c3.DELETE_NEXT_WORD;
                } else if (y3.a.R(jA3, companion.c())) {
                    c3Var2 = c3.DESELECT;
                }
            } else if (h3.j(iA2, companion4.f())) {
                long jA4 = d.a(event);
                if (y3.a.R(jA4, companion.s()) || y3.a.R(jA4, companion.C())) {
                    c3Var2 = c3.SELECT_LINE_START;
                } else if (y3.a.R(jA4, companion.r()) || y3.a.R(jA4, companion.B())) {
                    c3Var2 = c3.SELECT_LINE_END;
                }
            } else if (h3.j(iA2, companion4.a()) && y3.a.R(d.a(event), companion.h())) {
                c3Var2 = c3.DELETE_TO_LINE_END;
            }
            return c3Var2 == null ? this.f130029a.a(event) : c3Var2;
        }
    }

    public static final e3 a(int i15) {
        return new a(i15);
    }

    public static final e3 b() {
        return f130027a;
    }
}
