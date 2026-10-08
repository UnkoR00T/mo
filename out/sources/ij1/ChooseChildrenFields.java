package ij1;

import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import vi1.ChildParticipant;

/* JADX INFO: renamed from: ij1.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0002&\u0018B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lij1/f;", "", "Lij1/f$a$a;", "children", "Lij1/f$a$b;", "statement", "<init>", "(Lij1/f$a$a;Lij1/f$a$b;)V", "", "Lij1/f$a;", "c", "()Ljava/util/List;", "Lvi1/a;", "Lhz/b;", "validationState", "g", "(Ljava/util/List;Lhz/b;)Lij1/f;", "", "isChecked", "i", "(Ljava/lang/Boolean;Lhz/b;)Lij1/f;", "Lij1/f$b;", "e", "()Lij1/f$b;", "a", "(Lij1/f$a$a;Lij1/f$a$b;)Lij1/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lij1/f$a$a;", "d", "()Lij1/f$a$a;", "b", "Lij1/f$a$b;", "f", "()Lij1/f$a$b;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChooseChildrenFields {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.Children children;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.Statement statement;

    /* JADX INFO: renamed from: ij1.f$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lij1/f$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        Children,
        Statement;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f93067d = wq.b.a(b());
    }

    public ChooseChildrenFields(a.Children children, a.Statement statement) {
        this.children = children;
        this.statement = statement;
    }

    public static /* synthetic */ ChooseChildrenFields b(ChooseChildrenFields chooseChildrenFields, a.Children children, a.Statement statement, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            children = chooseChildrenFields.children;
        }
        if ((i15 & 2) != 0) {
            statement = chooseChildrenFields.statement;
        }
        return chooseChildrenFields.a(children, statement);
    }

    private final List<a> c() {
        return pq.v.q(this.children, this.statement);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChooseChildrenFields h(ChooseChildrenFields chooseChildrenFields, List list, hz.b bVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = null;
        }
        if ((i15 & 2) != 0) {
            bVar = null;
        }
        return chooseChildrenFields.g(list, bVar);
    }

    public static /* synthetic */ ChooseChildrenFields j(ChooseChildrenFields chooseChildrenFields, Boolean bool, hz.b bVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bool = null;
        }
        if ((i15 & 2) != 0) {
            bVar = null;
        }
        return chooseChildrenFields.i(bool, bVar);
    }

    public final ChooseChildrenFields a(a.Children children, a.Statement statement) {
        return new ChooseChildrenFields(children, statement);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a.Children getChildren() {
        return this.children;
    }

    public final b e() {
        Object next;
        Iterator<T> it = c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((a) next).getValidationState().a());
        a aVar = (a) next;
        if (aVar != null) {
            return aVar.getField();
        }
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChooseChildrenFields)) {
            return false;
        }
        ChooseChildrenFields chooseChildrenFields = (ChooseChildrenFields) other;
        return fr.t.c(this.children, chooseChildrenFields.children) && fr.t.c(this.statement, chooseChildrenFields.statement);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a.Statement getStatement() {
        return this.statement;
    }

    public final ChooseChildrenFields g(List<ChildParticipant> children, hz.b validationState) {
        a.Children children2 = this.children;
        if (children == null) {
            children = children2.e();
        }
        List<ChildParticipant> list = children;
        if (validationState == null) {
            validationState = this.children.getValidationState();
        }
        return b(this, a.Children.d(children2, validationState, null, list, 2, null), null, 2, null);
    }

    public int hashCode() {
        return (this.children.hashCode() * 31) + this.statement.hashCode();
    }

    public final ChooseChildrenFields i(Boolean isChecked, hz.b validationState) {
        a.Statement statement = this.statement;
        boolean zBooleanValue = isChecked != null ? isChecked.booleanValue() : statement.getIsChecked();
        if (validationState == null) {
            validationState = this.statement.getValidationState();
        }
        return b(this, null, a.Statement.d(statement, validationState, null, zBooleanValue, 2, null), 1, null);
    }

    public String toString() {
        return "ChooseChildrenFields(children=" + this.children + ", statement=" + this.statement + ')';
    }

    /* JADX INFO: renamed from: ij1.f$a */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0007\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lij1/f$a;", "", "Lhz/b;", "b", "()Lhz/b;", "validationState", "Lij1/f$b;", "a", "()Lij1/f$b;", "field", "Lij1/f$a$a;", "Lij1/f$a$b;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        b getField();

        /* JADX INFO: renamed from: b */
        hz.b getValidationState();

        /* JADX INFO: renamed from: ij1.f$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lij1/f$a$a;", "Lij1/f$a;", "Lhz/b;", "validationState", "Lij1/f$b;", "field", "", "Lvi1/a;", "children", "<init>", "(Lhz/b;Lij1/f$b;Ljava/util/List;)V", "c", "(Lhz/b;Lij1/f$b;Ljava/util/List;)Lij1/f$a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhz/b;", "b", "()Lhz/b;", "Lij1/f$b;", "()Lij1/f$b;", "Ljava/util/List;", "e", "()Ljava/util/List;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Children implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b validationState;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final b field;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<ChildParticipant> children;

            public Children(hz.b bVar, b bVar2, List<ChildParticipant> list) {
                this.validationState = bVar;
                this.field = bVar2;
                this.children = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Children d(Children children, hz.b bVar, b bVar2, List list, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = children.validationState;
                }
                if ((i15 & 2) != 0) {
                    bVar2 = children.field;
                }
                if ((i15 & 4) != 0) {
                    list = children.children;
                }
                return children.c(bVar, bVar2, list);
            }

            @Override // ij1.ChooseChildrenFields.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public b getField() {
                return this.field;
            }

            @Override // ij1.ChooseChildrenFields.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public hz.b getValidationState() {
                return this.validationState;
            }

            public final Children c(hz.b validationState, b field, List<ChildParticipant> children) {
                return new Children(validationState, field, children);
            }

            public final List<ChildParticipant> e() {
                return this.children;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Children)) {
                    return false;
                }
                Children children = (Children) other;
                return fr.t.c(this.validationState, children.validationState) && this.field == children.field && fr.t.c(this.children, children.children);
            }

            public int hashCode() {
                return (((this.validationState.hashCode() * 31) + this.field.hashCode()) * 31) + this.children.hashCode();
            }

            public String toString() {
                return "Children(validationState=" + this.validationState + ", field=" + this.field + ", children=" + this.children + ')';
            }

            public /* synthetic */ Children(hz.b bVar, b bVar2, List list, int i15, fr.k kVar) {
                this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 2) != 0 ? b.Children : bVar2, (i15 & 4) != 0 ? pq.v.n() : list);
            }
        }

        /* JADX INFO: renamed from: ij1.f$a$b, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lij1/f$a$b;", "Lij1/f$a;", "Lhz/b;", "validationState", "Lij1/f$b;", "field", "", "isChecked", "<init>", "(Lhz/b;Lij1/f$b;Z)V", "c", "(Lhz/b;Lij1/f$b;Z)Lij1/f$a$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lhz/b;", "b", "()Lhz/b;", "Lij1/f$b;", "()Lij1/f$b;", "Z", "e", "()Z", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Statement implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f93060d = hz.b.f86845b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b validationState;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final b field;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isChecked;

            public Statement(hz.b bVar, b bVar2, boolean z15) {
                this.validationState = bVar;
                this.field = bVar2;
                this.isChecked = z15;
            }

            public static /* synthetic */ Statement d(Statement statement, hz.b bVar, b bVar2, boolean z15, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = statement.validationState;
                }
                if ((i15 & 2) != 0) {
                    bVar2 = statement.field;
                }
                if ((i15 & 4) != 0) {
                    z15 = statement.isChecked;
                }
                return statement.c(bVar, bVar2, z15);
            }

            @Override // ij1.ChooseChildrenFields.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public b getField() {
                return this.field;
            }

            @Override // ij1.ChooseChildrenFields.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public hz.b getValidationState() {
                return this.validationState;
            }

            public final Statement c(hz.b validationState, b field, boolean isChecked) {
                return new Statement(validationState, field, isChecked);
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final boolean getIsChecked() {
                return this.isChecked;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Statement)) {
                    return false;
                }
                Statement statement = (Statement) other;
                return fr.t.c(this.validationState, statement.validationState) && this.field == statement.field && this.isChecked == statement.isChecked;
            }

            public int hashCode() {
                return (((this.validationState.hashCode() * 31) + this.field.hashCode()) * 31) + Boolean.hashCode(this.isChecked);
            }

            public String toString() {
                return "Statement(validationState=" + this.validationState + ", field=" + this.field + ", isChecked=" + this.isChecked + ')';
            }

            public /* synthetic */ Statement(hz.b bVar, b bVar2, boolean z15, int i15, fr.k kVar) {
                this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 2) != 0 ? b.Statement : bVar2, (i15 & 4) != 0 ? false : z15);
            }
        }
    }
}
