package ya4;

import er.p;
import fu.r;
import iy.f0;
import iy.h;
import iy.t;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import pq.v;
import py.KeyStoreKeySpec;
import py.i;
import vq.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0001\u001cB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0018\u0010\u0012J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u001c\u0010\u0012J\u000f\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0016\u0010(\u001a\u0004\u0018\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'¨\u0006*"}, d2 = {"Lya4/a;", "Lxa4/a;", "Lcz/c;", "persistentStorageFactory", "Liy/t;", "keyStoreProvider", "Lez/a;", "currentTimeProvider", "Lpy/i;", "keyGenerator", "Lxw/d;", "dispatcherProvider", "Lpx/d;", "logger", "<init>", "(Lcz/c;Liy/t;Lez/a;Lpy/i;Lxw/d;Lpx/d;)V", "", "b", "(Ltq/e;)Ljava/lang/Object;", "count", "Loq/i0;", "f", "(ILtq/e;)Ljava/lang/Object;", "", "c", "timeSeconds", "d", "(JLtq/e;)Ljava/lang/Object;", "a", "e", "()J", "Lez/a;", "Lpy/i;", "Lxw/d;", "Lpx/d;", "Lcz/b;", "Lcz/b;", "persistentStorage", "Ljava/security/KeyStore;", "Ljava/security/KeyStore;", "keyStore", "g", "applicationlock"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements xa4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f225892h = cz.b.a.b("SHARED_PREFERENCES_APPLICATION_LOCK_TIME_KEY");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i keyGenerator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xw.d dispatcherProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final px.d logger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final cz.b persistentStorage;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final KeyStore keyStore;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225899e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Enumeration<String> enumerationAliases;
            ArrayList list;
            Object objE = uq.b.e();
            int i15 = this.f225899e;
            if (i15 == 0) {
                u.b(obj);
                KeyStore keyStore = a.this.keyStore;
                if (keyStore != null && (enumerationAliases = keyStore.aliases()) != null && (list = Collections.list(enumerationAliases)) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (r.V((String) obj2, "LOCKOUT_ATTEMPT_", false, 2, null)) {
                            arrayList.add(obj2);
                        }
                    }
                    a aVar = a.this;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        aVar.keyStore.deleteEntry((String) it.next());
                    }
                }
                cz.b bVar = a.this.persistentStorage;
                this.f225899e = 1;
                if (bVar.a(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)I"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements p<p0, tq.e<? super Integer>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225901e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Enumeration<String> enumerationAliases;
            ArrayList list;
            uq.b.e();
            if (this.f225901e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            KeyStore keyStore = a.this.keyStore;
            int i15 = 0;
            if (keyStore != null && (enumerationAliases = keyStore.aliases()) != null && (list = Collections.list(enumerationAliases)) != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                int i16 = 0;
                while (it.hasNext()) {
                    if (r.V((String) it.next(), "LOCKOUT_ATTEMPT_", false, 2, null) && (i16 = i16 + 1) < 0) {
                        v.w();
                    }
                }
                i15 = i16;
            }
            return vq.b.e(i15);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Integer> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)J"}, k = 3, mv = {2, 2, 0})
    static final class d extends k implements p<p0, tq.e<? super Long>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225903e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f225903e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            cz.b bVar = a.this.persistentStorage;
            String str = a.f225892h;
            this.f225903e = 1;
            Object objF = bVar.f(str, 0L, this);
            return objF == objE ? objE : objF;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Long> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225905e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f225907g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i15, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f225907g = i15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objA;
            Object objE = uq.b.e();
            int i15 = this.f225905e;
            if (i15 == 0) {
                u.b(obj);
                i iVar = a.this.keyGenerator;
                KeyStoreKeySpec keyStoreKeySpec = new KeyStoreKeySpec("LOCKOUT_ATTEMPT_" + this.f225907g, new h.a.b(0, new iy.r.a(0, 1, null), 0, 1, null), 0, null, v.e(py.h.ENCRYPT_AND_DECRYPT), null, false, null, 236, null);
                this.f225905e = 1;
                objA = iVar.a(keyStoreKeySpec, this);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                objA = obj;
            }
            dx.i iVar2 = (dx.i) objA;
            a aVar = a.this;
            int i16 = this.f225907g;
            if (iVar2 instanceof dx.i.Left) {
                dx.b bVar = (dx.b) ((dx.i.Left) iVar2).b();
                px.d dVar = aVar.logger;
                String str = "Failed to generate key for alias LOCKOUT_ATTEMPT_" + i16;
                dx.b.Generic generic = bVar instanceof dx.b.Generic ? (dx.b.Generic) bVar : null;
                px.b.y5(dVar, str, generic != null ? generic.getE() : null, null, 4, null);
            } else {
                if (!(iVar2 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                aVar.logger.F8("Generated key for alias LOCKOUT_ATTEMPT_" + i16, px.d.a.GENERAL);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new e(this.f225907g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225908e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f225910g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j15, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f225910g = j15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f225908e;
            if (i15 == 0) {
                u.b(obj);
                cz.b bVar = a.this.persistentStorage;
                String str = a.f225892h;
                long j15 = this.f225910g;
                this.f225908e = 1;
                if (bVar.m(str, j15, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new f(this.f225910g, eVar);
        }
    }

    public a(cz.c cVar, t tVar, ez.a aVar, i iVar, xw.d dVar, px.d dVar2) {
        this.currentTimeProvider = aVar;
        this.keyGenerator = iVar;
        this.dispatcherProvider = dVar;
        this.logger = dVar2;
        this.persistentStorage = cVar.a("SHARED_PREFERENCES_FILE_NAME", cz.d.ENCRYPTED);
        this.keyStore = (KeyStore) t.a(tVar, f0.ANDROID_KEY_STORE, null, null, 6, null).a();
    }

    @Override // xa4.a
    public Object a(tq.e<? super i0> eVar) {
        Object objA = this.dispatcherProvider.a(new b(null), eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    @Override // xa4.a
    public Object b(tq.e<? super Integer> eVar) {
        return this.dispatcherProvider.a(new c(null), eVar);
    }

    @Override // xa4.a
    public Object c(tq.e<? super Long> eVar) {
        return this.dispatcherProvider.a(new d(null), eVar);
    }

    @Override // xa4.a
    public Object d(long j15, tq.e<? super i0> eVar) {
        Object objA = this.dispatcherProvider.a(new f(j15, null), eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    @Override // xa4.a
    public long e() {
        return this.currentTimeProvider.e() / ((long) 1000);
    }

    @Override // xa4.a
    public Object f(int i15, tq.e<? super i0> eVar) {
        Object objA = this.dispatcherProvider.a(new e(i15, null), eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }
}
