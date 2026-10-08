package o8;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements u {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f143133t = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final a f143134u = new a(new a.InterfaceC3547a() { // from class: o8.k
        @Override // o8.m.a.InterfaceC3547a
        public final Constructor a() {
            return m.l();
        }
    });

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final a f143135v = new a(new a.InterfaceC3547a() { // from class: o8.l
        @Override // o8.m.a.InterfaceC3547a
        public final Constructor a() {
            return m.m();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f143136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f143137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f143138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f143139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f143140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f143141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f143142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f143143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f143144j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f143146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ak.n0<t7.p> f143147m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f143152r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f143153s;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f143145k = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f143148n = 112800;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private l9.s.a f143150p = new l9.h();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f143149o = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f143151q = 3;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3547a f143154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f143155b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Constructor<? extends p> f143156c;

        /* JADX INFO: renamed from: o8.m$a$a, reason: collision with other inner class name */
        public interface InterfaceC3547a {
            Constructor<? extends p> a();
        }

        public a(InterfaceC3547a interfaceC3547a) {
            this.f143154a = interfaceC3547a;
        }

        private Constructor<? extends p> b() {
            synchronized (this.f143155b) {
                if (this.f143155b.get()) {
                    return this.f143156c;
                }
                try {
                    return this.f143154a.a();
                } catch (ClassNotFoundException unused) {
                    this.f143155b.set(true);
                    return this.f143156c;
                } catch (Exception e15) {
                    throw new RuntimeException("Error instantiating extension", e15);
                }
            }
        }

        public p a(Object... objArr) {
            Constructor<? extends p> constructorB = b();
            if (constructorB == null) {
                return null;
            }
            try {
                return constructorB.newInstance(objArr);
            } catch (Exception e15) {
                throw new IllegalStateException("Unexpected error creating extractor", e15);
            }
        }
    }

    private void i(int i15, List<p> list) {
        switch (i15) {
            case 0:
                list.add(new v9.b());
                break;
            case 1:
                list.add(new v9.e());
                break;
            case 2:
                list.add(new v9.h((this.f143137c ? 2 : 0) | ((this.f143138d | (this.f143136b ? 1 : 0)) == true ? 1 : 0)));
                break;
            case 3:
                list.add(new p8.b((this.f143137c ? 2 : 0) | this.f143139e | (this.f143136b ? 1 : 0)));
                break;
            case 4:
                p pVarA = f143134u.a(Integer.valueOf(this.f143140f));
                if (pVarA == null) {
                    list.add(new t8.d(this.f143140f));
                } else {
                    list.add(pVarA);
                }
                break;
            case 5:
                list.add(new u8.c());
                break;
            case 6:
                list.add(new g9.e(this.f143150p, (this.f143149o ? 0 : 2) | this.f143141g));
                break;
            case 7:
                list.add(new h9.g((this.f143137c ? 2 : 0) | this.f143144j | (this.f143136b ? 1 : 0)));
                break;
            case 8:
                list.add(new i9.h(this.f143150p, this.f143143i | i9.h.l(this.f143151q) | (this.f143149o ? 0 : 32)));
                list.add(new i9.q(this.f143150p, (this.f143149o ? 0 : 16) | this.f143142h | i9.q.r(this.f143151q)));
                break;
            case 9:
                list.add(new j9.d());
                break;
            case 10:
                list.add(new v9.c0());
                break;
            case 11:
                if (this.f143147m == null) {
                    this.f143147m = ak.n0.C();
                }
                list.add(new v9.k0(this.f143145k, !this.f143149o ? 1 : 0, this.f143150p, new w7.k0(0L), new v9.j(this.f143146l, this.f143147m), this.f143148n));
                break;
            case 12:
                list.add(new w9.b());
                break;
            case 14:
                list.add(new w8.a(this.f143152r));
                break;
            case 15:
                p pVarA2 = f143135v.a(new Object[0]);
                if (pVarA2 != null) {
                    list.add(pVarA2);
                }
                break;
            case 16:
                list.add(new q8.b(!this.f143149o ? 1 : 0, this.f143150p));
                break;
            case 17:
                list.add(new k9.a());
                break;
            case 18:
                list.add(new x9.a());
                break;
            case 19:
                list.add(new s8.a());
                break;
            case 20:
                list.add(new v8.b(this.f143153s));
                break;
            case 21:
                list.add(new r8.a());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends p> l() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(p.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends p> m() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(p.class).getConstructor(null);
    }

    @Override // o8.u
    public synchronized p[] d(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = f143133t;
            arrayList = new ArrayList(iArr.length);
            int iB = t7.m.b(map);
            if (iB != -1) {
                i(iB, arrayList);
            }
            int iC = t7.m.c(uri);
            if (iC != -1 && iC != iB) {
                i(iC, arrayList);
            }
            for (int i15 : iArr) {
                if (i15 != iB && i15 != iC) {
                    i(i15, arrayList);
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return (p[]) arrayList.toArray(new p[0]);
    }

    @Override // o8.u
    public synchronized p[] f() {
        return d(Uri.EMPTY, new HashMap());
    }

    @Override // o8.u
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public synchronized m b(int i15) {
        this.f143151q = i15;
        return this;
    }

    @Override // o8.u
    @Deprecated
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public synchronized m c(boolean z15) {
        this.f143149o = z15;
        return this;
    }

    public synchronized m n(int i15) {
        this.f143153s = i15;
        return this;
    }

    public synchronized m o(int i15) {
        this.f143152r = i15;
        return this;
    }

    @Override // o8.u
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public synchronized m a(l9.s.a aVar) {
        this.f143150p = aVar;
        return this;
    }
}
