package p060i1;

import n4.CollectionInfo;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p056h1.t1;
import p071kotlin.Metadata;
import p143z0.a2;
import tq.e;
import uq.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li1/i1;", "state", "", "isVertical", "Lh1/t1;", "a", "(Li1/i1;Z)Lh1/t1;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"i1/l$a", "Lh1/t1;", "", "index", "Loq/i0;", "f", "(ILtq/e;)Ljava/lang/Object;", "Ln4/d;", "c", "()Ln4/d;", "", "e", "()F", "scrollOffset", "b", "maxScrollOffset", "d", "()I", "viewport", "a", "contentPadding", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements t1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1 f87950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f87951b;

        a(i1 i1Var, boolean z15) {
            this.f87950a = i1Var;
            this.f87951b = z15;
        }

        @Override // p056h1.t1
        public int a() {
            return this.f87950a.I().f() + this.f87950a.I().getAfterContentPadding();
        }

        @Override // p056h1.t1
        public float b() {
            return m1.j(this.f87950a.I(), this.f87950a.N());
        }

        @Override // p056h1.t1
        public CollectionInfo c() {
            return this.f87951b ? new CollectionInfo(this.f87950a.N(), 1) : new CollectionInfo(1, this.f87950a.N());
        }

        @Override // p056h1.t1
        public int d() {
            return (int) (this.f87950a.I().getOrientation() == a2.Vertical ? this.f87950a.I().b() & BodyPartID.bodyIdMax : this.f87950a.I().b() >> 32);
        }

        @Override // p056h1.t1
        public float e() {
            return y0.a(this.f87950a);
        }

        @Override // p056h1.t1
        public Object f(int i15, e<? super i0> eVar) {
            Object objL0 = i1.l0(this.f87950a, i15, 0.0f, eVar, 2, null);
            return objL0 == b.e() ? objL0 : i0.f148189a;
        }
    }

    public static final t1 a(i1 i1Var, boolean z15) {
        return new a(i1Var, z15);
    }
}
