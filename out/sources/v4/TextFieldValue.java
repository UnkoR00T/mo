package v4;

import java.util.List;
import p071kotlin.Metadata;
import q4.a4;
import q4.v2;
import q4.z3;

/* JADX INFO: renamed from: v4.t0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB)\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u000bJ-\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0018¨\u0006'"}, d2 = {"Lv4/t0;", "", "Lq4/e;", "annotatedString", "Lq4/z3;", "selection", "composition", "<init>", "(Lq4/e;JLq4/z3;Lfr/k;)V", "", "text", "(Ljava/lang/String;JLq4/z3;Lfr/k;)V", "g", "(Lq4/e;JLq4/z3;)Lv4/t0;", "f", "(Ljava/lang/String;JLq4/z3;)Lv4/t0;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Lq4/e;", "j", "()Lq4/e;", "b", "J", "l", "()J", "c", "Lq4/z3;", "k", "()Lq4/z3;", "m", "d", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextFieldValue {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b3.x<TextFieldValue, Object> f203713e = b3.a0.e(new er.p() { // from class: v4.r0
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return TextFieldValue.c((b3.b0) obj, (TextFieldValue) obj2);
        }
    }, new er.l() { // from class: v4.s0
        @Override // er.l
        public final Object b(Object obj) {
            return TextFieldValue.d(obj);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q4.e text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long selection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final z3 composition;

    /* JADX INFO: renamed from: v4.t0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv4/t0$a;", "", "<init>", "()V", "Lb3/x;", "Lv4/t0;", "Saver", "Lb3/x;", "a", "()Lb3/x;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final b3.x<TextFieldValue, Object> a() {
            return TextFieldValue.f203713e;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextFieldValue(String str, long j15, z3 z3Var, fr.k kVar) {
        this(str, j15, z3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(b3.b0 b0Var, TextFieldValue textFieldValue) {
        return pq.v.g(v2.T1(textFieldValue.text, v2.v1(), b0Var), v2.T1(z3.b(textFieldValue.selection), v2.M1(z3.INSTANCE), b0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue d(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        b3.x<q4.e, Object> xVarV1 = v2.v1();
        Boolean bool = Boolean.FALSE;
        z3 z3VarB = null;
        q4.e eVarB = ((!fr.t.c(obj2, bool) || (xVarV1 instanceof q4.x)) && obj2 != null) ? xVarV1.b(obj2) : null;
        Object obj3 = list.get(1);
        b3.x<z3, Object> xVarM1 = v2.M1(z3.INSTANCE);
        if ((!fr.t.c(obj3, bool) || (xVarM1 instanceof q4.x)) && obj3 != null) {
            z3VarB = xVarM1.b(obj3);
        }
        return new TextFieldValue(eVarB, z3VarB.getPackedValue(), (z3) null, 4, (fr.k) null);
    }

    public static /* synthetic */ TextFieldValue h(TextFieldValue textFieldValue, String str, long j15, z3 z3Var, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            j15 = textFieldValue.selection;
        }
        if ((i15 & 4) != 0) {
            z3Var = textFieldValue.composition;
        }
        return textFieldValue.f(str, j15, z3Var);
    }

    public static /* synthetic */ TextFieldValue i(TextFieldValue textFieldValue, q4.e eVar, long j15, z3 z3Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            eVar = textFieldValue.text;
        }
        if ((i15 & 2) != 0) {
            j15 = textFieldValue.selection;
        }
        if ((i15 & 4) != 0) {
            z3Var = textFieldValue.composition;
        }
        return textFieldValue.g(eVar, j15, z3Var);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) other;
        return z3.g(this.selection, textFieldValue.selection) && fr.t.c(this.composition, textFieldValue.composition) && fr.t.c(this.text, textFieldValue.text);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextFieldValue f(String text, long selection, z3 composition) {
        return new TextFieldValue(new q4.e(text, null, 2, 0 == true ? 1 : 0), selection, composition, (fr.k) null);
    }

    public final TextFieldValue g(q4.e annotatedString, long selection, z3 composition) {
        return new TextFieldValue(annotatedString, selection, composition, (fr.k) null);
    }

    public int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + z3.o(this.selection)) * 31;
        z3 z3Var = this.composition;
        return iHashCode + (z3Var != null ? z3.o(z3Var.getPackedValue()) : 0);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final q4.e getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final z3 getComposition() {
        return this.composition;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    public final String m() {
        return this.text.getText();
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.text) + "', selection=" + ((Object) z3.q(this.selection)) + ", composition=" + this.composition + ')';
    }

    public /* synthetic */ TextFieldValue(q4.e eVar, long j15, z3 z3Var, fr.k kVar) {
        this(eVar, j15, z3Var);
    }

    private TextFieldValue(q4.e eVar, long j15, z3 z3Var) {
        this.text = eVar;
        this.selection = a4.c(j15, 0, m().length());
        this.composition = z3Var != null ? z3.b(a4.c(z3Var.getPackedValue(), 0, m().length())) : null;
    }

    public /* synthetic */ TextFieldValue(q4.e eVar, long j15, z3 z3Var, int i15, fr.k kVar) {
        this(eVar, (i15 & 2) != 0 ? z3.INSTANCE.a() : j15, (i15 & 4) != 0 ? null : z3Var, (fr.k) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j15, z3 z3Var, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? z3.INSTANCE.a() : j15, (i15 & 4) != 0 ? null : z3Var, (fr.k) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldValue(String str, long j15, z3 z3Var) {
        this(new q4.e(str, null, 2, 0 == true ? 1 : 0), j15, z3Var, (fr.k) null);
    }
}
