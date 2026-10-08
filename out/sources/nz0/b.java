package nz0;

import androidx.appcompat.app.f;
import er.p;
import ju.g1;
import ju.p0;
import ju.q0;
import oq.i0;
import oq.k;
import oq.l;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lnz0/b;", "Lpz0/a;", "Lcz/c;", "persistentStorageFactory", "<init>", "(Lcz/c;)V", "Llz0/a;", "b", "(Ltq/e;)Ljava/lang/Object;", "chosenTheme", "Loq/i0;", "a", "(Llz0/a;Ltq/e;)Ljava/lang/Object;", "c", "()V", "Lju/p0;", "Lju/p0;", "mainScope", "Lcz/b;", "Loq/k;", "e", "()Lcz/b;", "persistentStorage", "appearance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements pz0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f139718d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p0 mainScope = q0.a(g1.c());

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k persistentStorage;

    /* JADX INFO: renamed from: nz0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3463b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f139721d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f139722e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f139724g;

        C3463b(e<? super C3463b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f139722e = obj;
            this.f139724g |= PKIFailureInfo.systemUnavail;
            return b.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f139725e;

        c(e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f139725e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            f.L(-1);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new c(eVar);
        }
    }

    public b(final cz.c cVar) {
        this.persistentStorage = l.a(new er.a() { // from class: nz0.a
            @Override // er.a
            public final Object a() {
                return b.f(cVar);
            }
        });
    }

    private final cz.b e() {
        return (cz.b) this.persistentStorage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cz.b f(cz.c cVar) {
        return cVar.a("shared_prefs_appearance", cz.d.PLAIN);
    }

    @Override // pz0.a
    public Object a(lz0.a aVar, e<? super i0> eVar) {
        Object objE = e().e(cz.b.a.b("APPEARANCE_CURRENT_THEME"), aVar.getValue(), eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pz0.a
    public Object b(e<? super lz0.a> eVar) throws Throwable {
        C3463b c3463b;
        lz0.a.Companion companion;
        if (eVar instanceof C3463b) {
            c3463b = (C3463b) eVar;
            int i15 = c3463b.f139724g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3463b.f139724g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3463b = new C3463b(eVar);
            }
        } else {
            c3463b = new C3463b(eVar);
        }
        Object obj = c3463b.f139722e;
        Object objE = uq.b.e();
        int i16 = c3463b.f139724g;
        if (i16 == 0) {
            u.b(obj);
            lz0.a.Companion companion2 = lz0.a.INSTANCE;
            cz.b bVarE = e();
            String strB = cz.b.a.b("APPEARANCE_CURRENT_THEME");
            c3463b.f139721d = companion2;
            c3463b.f139724g = 1;
            Object objJ = bVarE.j(strB, c3463b);
            if (objJ == objE) {
                return objE;
            }
            companion = companion2;
            obj = objJ;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion = (lz0.a.Companion) c3463b.f139721d;
            u.b(obj);
        }
        String value = (String) obj;
        if (value == null) {
            value = lz0.a.SYSTEM.getValue();
        }
        return companion.a(value);
    }

    @Override // pz0.a
    public void c() {
        ju.k.d(this.mainScope, null, null, new c(null), 3, null);
    }
}
