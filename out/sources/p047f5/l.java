package p047f5;

import androidx.compose.ui.platform.t1;
import androidx.compose.ui.platform.v1;
import androidx.compose.ui.platform.w1;
import c5.d;
import f3.m;
import fr.w;
import java.util.ArrayList;
import oq.i0;
import p036e4.x1;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002%&B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00060\u0007R\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J/\u0010\u0011\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010\u0014\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\b\u0018\u00010\u0007R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR$\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00040!j\b\u0012\u0004\u0012\u00020\u0004`\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#¨\u0006'"}, d2 = {"Lf5/l;", "Lf5/i;", "<init>", "()V", "Lf5/f;", "i", "()Lf5/f;", "Lf5/l$b;", "j", "()Lf5/l$b;", "Loq/i0;", "f", "Lf3/m;", "ref", "Lkotlin/Function1;", "Lf5/e;", "constrainBlock", "h", "(Lf3/m;Lf5/f;Ler/l;)Lf3/m;", "", "Z", "isAnimateChanges", "()Z", "setAnimateChanges", "(Z)V", "isAnimateChanges$annotations", "g", "Lf5/l$b;", "referencesObject", "", "I", "ChildrenStartIndex", "childId", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "childrenRefs", "a", "b", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isAnimateChanges;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private b referencesObject;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int ChildrenStartIndex;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int childId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<f> childrenRefs;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lf5/l$a;", "Le4/x1;", "Landroidx/compose/ui/platform/w1;", "Lf5/f;", "ref", "Lkotlin/Function1;", "Lf5/e;", "Loq/i0;", "constrainBlock", "<init>", "(Lf5/f;Ler/l;)V", "Lc5/d;", "", "parentData", "Lf5/k;", "a", "(Lc5/d;Ljava/lang/Object;)Lf5/k;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lf5/f;", "f", "Ler/l;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a extends w1 implements x1 {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final f ref;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final er.l<e, i0> constrainBlock;

        /* JADX INFO: renamed from: f5.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {1, 8, 0})
        public static final class C1325a extends w implements er.l<v1, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f59237b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ er.l f59238c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1325a(f fVar, er.l lVar) {
                super(1);
                this.f59237b = fVar;
                this.f59238c = lVar;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(v1 v1Var) {
                c(v1Var);
                return i0.f148189a;
            }

            public final void c(v1 v1Var) {
                v1Var.b("constrainAs");
                v1Var.getProperties().b("ref", this.f59237b);
                v1Var.getProperties().b("constrainBlock", this.f59238c);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(f fVar, er.l<? super e, i0> lVar) {
            super(t1.b() ? new C1325a(fVar, lVar) : t1.a());
            this.ref = fVar;
            this.constrainBlock = lVar;
        }

        @Override // p036e4.x1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k n(d dVar, Object obj) {
            return new k(this.ref, this.constrainBlock);
        }

        public boolean equals(Object other) {
            er.l<e, i0> lVar = this.constrainBlock;
            a aVar = other instanceof a ? (a) other : null;
            return lVar == (aVar != null ? aVar.constrainBlock : null);
        }

        public int hashCode() {
            return this.constrainBlock.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0010\u0010\f\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0010\u0010\r\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\r\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lf5/l$b;", "", "<init>", "(Lf5/l;)V", "Lf5/f;", "a", "()Lf5/f;", "e", "f", "g", "h", "i", "j", "k", "l", "b", "c", "d", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b {
        public b() {
        }

        public final f a() {
            return l.this.i();
        }

        public final f b() {
            return l.this.i();
        }

        public final f c() {
            return l.this.i();
        }

        public final f d() {
            return l.this.i();
        }

        public final f e() {
            return l.this.i();
        }

        public final f f() {
            return l.this.i();
        }

        public final f g() {
            return l.this.i();
        }

        public final f h() {
            return l.this.i();
        }

        public final f i() {
            return l.this.i();
        }

        public final f j() {
            return l.this.i();
        }

        public final f k() {
            return l.this.i();
        }

        public final f l() {
            return l.this.i();
        }
    }

    public l() {
        super(null);
        this.childId = this.ChildrenStartIndex;
        this.childrenRefs = new ArrayList<>();
    }

    @Override // p047f5.i
    public void f() {
        super.f();
        this.childId = this.ChildrenStartIndex;
    }

    public final m h(m mVar, f fVar, er.l<? super e, i0> lVar) {
        if (this.isAnimateChanges) {
            lVar.b(new e(fVar.getId(), b(fVar)));
        }
        return mVar.u(new a(fVar, lVar));
    }

    public final f i() {
        ArrayList<f> arrayList = this.childrenRefs;
        int i15 = this.childId;
        this.childId = i15 + 1;
        f fVar = (f) v.o0(arrayList, i15);
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(Integer.valueOf(this.childId));
        this.childrenRefs.add(fVar2);
        return fVar2;
    }

    public final b j() {
        b bVar = this.referencesObject;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.referencesObject = bVar2;
        return bVar2;
    }
}
