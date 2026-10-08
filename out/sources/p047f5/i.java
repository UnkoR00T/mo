package p047f5;

import c5.h;
import er.l;
import fr.t;
import j5.a;
import j5.f;
import java.util.ArrayList;
import java.util.List;
import k5.b;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0012\b'\u0018\u00002\u00020\u0001:\u0003\t\u0015\u0013B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0002*\u00020\u000eH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010\u001dR2\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0#0\"8\u0004X\u0085\u0004¢\u0006\u0012\n\u0004\b\t\u0010$\u0012\u0004\b'\u0010\f\u001a\u0004\b%\u0010&R \u0010-\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010)\u0012\u0004\b,\u0010\f\u001a\u0004\b*\u0010+R(\u00102\u001a\u00020\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010.\u0012\u0004\b1\u0010\f\u001a\u0004\b/\u0010\u001d\"\u0004\b0\u0010 R\u0014\u00103\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010.R\u0016\u00104\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Lf5/i;", "", "Lj5/f;", "extendFrom", "<init>", "(Lj5/f;)V", "Lf5/d0;", "state", "Loq/i0;", "a", "(Lf5/d0;)V", "f", "()V", "", "Lf5/y;", "elements", "Lc5/h;", "margin", "Lf5/i$b;", "c", "([Lf5/y;F)Lf5/i$b;", "b", "(Lf5/y;)Lj5/f;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "value", "g", "(I)V", "d", "", "Lkotlin/Function1;", "Ljava/util/List;", "getTasks", "()Ljava/util/List;", "getTasks$annotations", "tasks", "Lj5/f;", "getContainerObject", "()Lj5/f;", "getContainerObject$annotations", "containerObject", "I", "e", "setHelpersHashCode", "getHelpersHashCode$annotations", "helpersHashCode", "HelpersStartId", "helperId", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<l<d0, i0>> tasks = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f containerObject;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int helpersHashCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int HelpersStartId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int helperId;

    /* JADX INFO: renamed from: f5.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lf5/i$a;", "", "id", "Lf5/y;", "reference", "<init>", "(Ljava/lang/Object;Lf5/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getId$constraintlayout_compose_release", "()Ljava/lang/Object;", "b", "Lf5/y;", "getReference", "()Lf5/y;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class BaselineAnchor {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final y reference;

        public BaselineAnchor(Object obj, y yVar) {
            this.id = obj;
            this.reference = yVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BaselineAnchor)) {
                return false;
            }
            BaselineAnchor baselineAnchor = (BaselineAnchor) other;
            return t.c(this.id, baselineAnchor.id) && t.c(this.reference, baselineAnchor.reference);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.reference.hashCode();
        }

        public String toString() {
            return "BaselineAnchor(id=" + this.id + ", reference=" + this.reference + ')';
        }
    }

    /* JADX INFO: renamed from: f5.i$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lf5/i$b;", "", "id", "", "index", "Lf5/y;", "reference", "<init>", "(Ljava/lang/Object;ILf5/y;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "I", "c", "Lf5/y;", "getReference", "()Lf5/y;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class HorizontalAnchor {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int index;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final y reference;

        public HorizontalAnchor(Object obj, int i15, y yVar) {
            this.id = obj;
            this.index = i15;
            this.reference = yVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HorizontalAnchor)) {
                return false;
            }
            HorizontalAnchor horizontalAnchor = (HorizontalAnchor) other;
            return t.c(this.id, horizontalAnchor.id) && this.index == horizontalAnchor.index && t.c(this.reference, horizontalAnchor.reference);
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + this.reference.hashCode();
        }

        public String toString() {
            return "HorizontalAnchor(id=" + this.id + ", index=" + this.index + ", reference=" + this.reference + ')';
        }
    }

    /* JADX INFO: renamed from: f5.i$c, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lf5/i$c;", "", "id", "", "index", "Lf5/y;", "reference", "<init>", "(Ljava/lang/Object;ILf5/y;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "I", "c", "Lf5/y;", "getReference", "()Lf5/y;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class VerticalAnchor {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int index;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final y reference;

        public VerticalAnchor(Object obj, int i15, y yVar) {
            this.id = obj;
            this.index = i15;
            this.reference = yVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerticalAnchor)) {
                return false;
            }
            VerticalAnchor verticalAnchor = (VerticalAnchor) other;
            return t.c(this.id, verticalAnchor.id) && this.index == verticalAnchor.index && t.c(this.reference, verticalAnchor.reference);
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + this.reference.hashCode();
        }

        public String toString() {
            return "VerticalAnchor(id=" + this.id + ", index=" + this.index + ", reference=" + this.reference + ')';
        }
    }

    public i(f fVar) {
        f fVarClone;
        this.containerObject = (fVar == null || (fVarClone = fVar.clone()) == null) ? new f(new char[0]) : fVarClone;
        this.HelpersStartId = 1000;
        this.helperId = 1000;
    }

    private final int d() {
        int i15 = this.helperId;
        this.helperId = i15 + 1;
        return i15;
    }

    private final void g(int value) {
        this.helpersHashCode = ((this.helpersHashCode * 1009) + value) % 1000000007;
    }

    public final void a(d0 state) {
        b.v(this.containerObject, state, new b.d());
    }

    public final f b(y yVar) {
        String string = yVar.getId().toString();
        if (this.containerObject.U(string) == null) {
            this.containerObject.j0(string, new f(new char[0]));
        }
        return this.containerObject.T(string);
    }

    public final HorizontalAnchor c(y[] elements, float margin) {
        z zVar = new z(Integer.valueOf(d()));
        a aVar = new a(new char[0]);
        for (y yVar : elements) {
            aVar.v(j5.i.v(yVar.getId().toString()));
        }
        f fVarB = b(zVar);
        fVarB.l0("type", "barrier");
        fVarB.l0("direction", "bottom");
        fVarB.k0("margin", margin);
        fVarB.j0("contains", aVar);
        g(15);
        for (y yVar2 : elements) {
            g(yVar2.hashCode());
        }
        g(h.q(margin));
        return new HorizontalAnchor(zVar.getId(), 0, zVar);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getHelpersHashCode() {
        return this.helpersHashCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof i) {
            return t.c(this.containerObject, ((i) other).containerObject);
        }
        return false;
    }

    public void f() {
        this.containerObject.clear();
        this.helperId = this.HelpersStartId;
        this.helpersHashCode = 0;
    }

    public int hashCode() {
        return this.containerObject.hashCode();
    }
}
