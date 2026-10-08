package pz0;

import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpz0/d;", "Lgz/b;", "Lpz0/d$a;", "Loq/i0;", "Lpz0/a;", "appearanceDataSource", "<init>", "(Lpz0/a;)V", "params", "d", "(Lpz0/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lpz0/a;", "appearance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b<Params, i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a appearanceDataSource;

    /* JADX INFO: renamed from: pz0.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpz0/d$a;", "Lgz/b$a;", "Llz0/a;", "chosenTheme", "<init>", "(Llz0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llz0/a;", "()Llz0/a;", "appearance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final lz0.a chosenTheme;

        public Params(lz0.a aVar) {
            this.chosenTheme = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final lz0.a getChosenTheme() {
            return this.chosenTheme;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && this.chosenTheme == ((Params) other).chosenTheme;
        }

        public int hashCode() {
            return this.chosenTheme.hashCode();
        }

        public String toString() {
            return "Params(chosenTheme=" + this.chosenTheme + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f163296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f163297e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f163299g;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f163297e = obj;
            this.f163299g |= PKIFailureInfo.systemUnavail;
            return d.this.d(null, this);
        }
    }

    public d(a aVar) {
        this.appearanceDataSource = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, e<? super i0> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f163299g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f163299g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f163297e;
        Object objE = uq.b.e();
        int i16 = bVar.f163299g;
        if (i16 == 0) {
            u.b(obj);
            a aVar = this.appearanceDataSource;
            lz0.a chosenTheme = params.getChosenTheme();
            bVar.f163296d = j.a(params);
            bVar.f163299g = 1;
            if (aVar.a(chosenTheme, bVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        return i0.f148189a;
    }
}
