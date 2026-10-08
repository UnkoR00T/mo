package x1;

import java.util.List;
import p071kotlin.Metadata;
import p079n1.j2;
import p079n1.s3;
import p079n1.s4;
import q4.a4;
import q4.z3;
import v4.CommitTextCommand;
import v4.ImeOptions;
import v4.TextFieldValue;
import v4.TransformedText;
import z1.c2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b;\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u0019*\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ]\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u0016R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00103\u001a\u0004\b9\u00105\"\u0004\b:\u00107R\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00103\u001a\u0004\b\f\u00105\"\u0004\b<\u00107R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u00105¨\u0006W"}, d2 = {"Lx1/v;", "Lg4/j;", "Lg4/i1;", "Lv4/c1;", "transformedText", "Lv4/t0;", "value", "Ln1/s3;", "state", "", "readOnly", "enabled", "isPassword", "Lv4/i0;", "offsetMapping", "Lz1/c2;", "manager", "Lv4/u;", "imeOptions", "Ll3/d0;", "focusRequester", "<init>", "(Lv4/c1;Lv4/t0;Ln1/s3;ZZZLv4/i0;Lz1/c2;Lv4/u;Ll3/d0;)V", "", "text", "Loq/i0;", "S3", "(Ln1/s3;Ljava/lang/String;ZZ)V", "Ln4/i0;", "E2", "(Ln4/i0;)V", "T3", "v", "Lv4/c1;", "getTransformedText", "()Lv4/c1;", "setTransformedText", "(Lv4/c1;)V", "w", "Lv4/t0;", "getValue", "()Lv4/t0;", "setValue", "(Lv4/t0;)V", "x", "Ln1/s3;", "getState", "()Ln1/s3;", "setState", "(Ln1/s3;)V", "y", "Z", "getReadOnly", "()Z", "setReadOnly", "(Z)V", "z", "getEnabled", "setEnabled", "A", "setPassword", "B", "Lv4/i0;", "getOffsetMapping", "()Lv4/i0;", "setOffsetMapping", "(Lv4/i0;)V", "C", "Lz1/c2;", "getManager", "()Lz1/c2;", "setManager", "(Lz1/c2;)V", ip.a.f96138c, "Lv4/u;", "getImeOptions", "()Lv4/u;", "setImeOptions", "(Lv4/u;)V", "E", "Ll3/d0;", "getFocusRequester", "()Ll3/d0;", "setFocusRequester", "(Ll3/d0;)V", "F2", "shouldMergeDescendantSemantics", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v extends g4.j implements g4.i1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean isPassword;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private v4.i0 offsetMapping;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private c2 manager;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private ImeOptions imeOptions;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private l3.d0 focusRequester;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private TransformedText transformedText;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue value;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private s3 state;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean readOnly;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    public v(TransformedText transformedText, TextFieldValue textFieldValue, s3 s3Var, boolean z15, boolean z16, boolean z17, v4.i0 i0Var, c2 c2Var, ImeOptions imeOptions, l3.d0 d0Var) {
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = s3Var;
        this.readOnly = z15;
        this.enabled = z16;
        this.isPassword = z17;
        this.offsetMapping = i0Var;
        this.manager = c2Var;
        this.imeOptions = imeOptions;
        this.focusRequester = d0Var;
        c2Var.O0(new er.a() { // from class: x1.m
            @Override // er.a
            public final Object a() {
                return v.G3(this.f216373a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G3(v vVar) {
        g4.h.m(vVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean H3(v vVar, h3.w wVar) {
        vVar.state.O(true);
        vVar.state.I(true);
        vVar.S3(vVar.state, (String) wVar.a(), vVar.readOnly, vVar.enabled);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean I3(v vVar) {
        vVar.manager.I();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J3(v vVar) {
        vVar.manager.w0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K3(v vVar, List list) {
        if (vVar.state.n() == null) {
            return false;
        }
        list.add(vVar.state.n().getValue());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L3(v vVar, q4.e eVar) {
        vVar.S3(vVar.state, eVar.getText(), vVar.readOnly, vVar.enabled);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean M3(v vVar, n4.i0 i0Var, q4.e eVar) {
        if (vVar.readOnly || !vVar.enabled) {
            return false;
        }
        v4.b1 inputSession = vVar.state.getInputSession();
        if (inputSession != null) {
            s4.INSTANCE.j(pq.v.q(new v4.p(), new CommitTextCommand(eVar, 1)), vVar.state.getProcessor(), vVar.state.r(), inputSession);
        } else {
            vVar.state.r().b(new TextFieldValue(fu.r.P0(vVar.value.m(), z3.n(vVar.value.getSelection()), z3.i(vVar.value.getSelection()), eVar).toString(), a4.a(z3.n(vVar.value.getSelection()) + eVar.length()), (z3) null, 4, (fr.k) null));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N3(v vVar, int i15, int i16, boolean z15) {
        if (!z15) {
            i15 = vVar.offsetMapping.b(i15);
        }
        if (!z15) {
            i16 = vVar.offsetMapping.b(i16);
        }
        if (!vVar.enabled) {
            return false;
        }
        if (i15 == z3.n(vVar.value.getSelection()) && i16 == z3.i(vVar.value.getSelection())) {
            return false;
        }
        if (Math.min(i15, i16) < 0 || Math.max(i15, i16) > vVar.value.getText().length()) {
            vVar.manager.O();
            return false;
        }
        if (z15 || i15 == i16) {
            vVar.manager.O();
        } else {
            c2.N(vVar.manager, false, 1, null);
        }
        vVar.state.r().b(new TextFieldValue(vVar.value.getText(), a4.b(i15, i16), (z3) null, 4, (fr.k) null));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O3(v vVar) {
        vVar.state.p().b(v4.t.j(vVar.imeOptions.getImeAction()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean P3(v vVar) {
        j2.h0(vVar.state, vVar.focusRequester, !vVar.readOnly);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Q3(v vVar) {
        c2.N(vVar.manager, false, 1, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean R3(v vVar) {
        c2.D(vVar.manager, false, 1, null);
        return true;
    }

    private final void S3(s3 state, String text, boolean readOnly, boolean enabled) {
        if (readOnly || !enabled) {
            return;
        }
        v4.b1 inputSession = state.getInputSession();
        if (inputSession != null) {
            s4.INSTANCE.j(pq.v.q(new v4.g(), new CommitTextCommand(text, 1)), state.getProcessor(), state.r(), inputSession);
        } else {
            state.r().b(new TextFieldValue(text, a4.a(text.length()), (z3) null, 4, (fr.k) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U3(v vVar) {
        g4.h.m(vVar);
        return oq.i0.f148189a;
    }

    @Override // g4.i1
    public void E2(final n4.i0 i0Var) {
        n4.f0.k0(i0Var, this.value.getText());
        n4.f0.g0(i0Var, this.transformedText.getText());
        n4.f0.C0(i0Var, this.value.getSelection());
        n4.f0.b0(i0Var, h3.s.INSTANCE.a());
        h3.w wVarB = h3.x.b(h3.w.INSTANCE, this.value.getText());
        if (wVarB != null) {
            n4.f0.h0(i0Var, wVarB);
        }
        n4.f0.A(i0Var, null, new er.l() { // from class: x1.n
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(v.H3(this.f216374a, (h3.w) obj));
            }
        }, 1, null);
        int keyboardType = this.imeOptions.getKeyboardType();
        v4.a0.Companion companion = v4.a0.INSTANCE;
        if (v4.a0.n(keyboardType, companion.c())) {
            n4.f0.d0(i0Var, h3.u.INSTANCE.a());
        } else if (v4.a0.n(keyboardType, companion.f()) || v4.a0.n(keyboardType, companion.e())) {
            n4.f0.d0(i0Var, h3.u.INSTANCE.b());
        } else if (v4.a0.n(keyboardType, companion.g())) {
            n4.f0.d0(i0Var, h3.u.INSTANCE.c());
        }
        if (!this.enabled) {
            n4.f0.j(i0Var);
        }
        if (this.isPassword) {
            n4.f0.N(i0Var);
        }
        boolean z15 = this.enabled && !this.readOnly;
        n4.f0.f0(i0Var, z15);
        n4.f0.s(i0Var, null, new er.l() { // from class: x1.p
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(v.K3(this.f216377a, (List) obj));
            }
        }, 1, null);
        if (z15) {
            n4.f0.B0(i0Var, null, new er.l() { // from class: x1.q
                @Override // er.l
                public final Object b(Object obj) {
                    return Boolean.valueOf(v.L3(this.f216392a, (q4.e) obj));
                }
            }, 1, null);
            n4.f0.w(i0Var, null, new er.l() { // from class: x1.r
                @Override // er.l
                public final Object b(Object obj) {
                    return Boolean.valueOf(v.M3(this.f216394a, i0Var, (q4.e) obj));
                }
            }, 1, null);
        }
        n4.f0.u0(i0Var, null, new er.q() { // from class: x1.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(v.N3(this.f216397a, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue()));
            }
        }, 1, null);
        n4.f0.C(i0Var, this.imeOptions.getImeAction(), null, new er.a() { // from class: x1.t
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(v.O3(this.f216409a));
            }
        }, 2, null);
        n4.f0.y(i0Var, null, new er.a() { // from class: x1.u
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(v.P3(this.f216410a));
            }
        }, 1, null);
        n4.f0.E(i0Var, null, new er.a() { // from class: x1.j
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(v.Q3(this.f216350a));
            }
        }, 1, null);
        if (!z3.h(this.value.getSelection()) && !this.isPassword) {
            n4.f0.f(i0Var, null, new er.a() { // from class: x1.k
                @Override // er.a
                public final Object a() {
                    return Boolean.valueOf(v.R3(this.f216368a));
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                n4.f0.h(i0Var, null, new er.a() { // from class: x1.l
                    @Override // er.a
                    public final Object a() {
                        return Boolean.valueOf(v.I3(this.f216370a));
                    }
                }, 1, null);
            }
        }
        if (!this.enabled || this.readOnly) {
            return;
        }
        n4.f0.P(i0Var, null, new er.a() { // from class: x1.o
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(v.J3(this.f216375a));
            }
        }, 1, null);
    }

    @Override // g4.i1
    /* JADX INFO: renamed from: F2 */
    public boolean getMergeDescendants() {
        return true;
    }

    public final void T3(TransformedText transformedText, TextFieldValue value, s3 state, boolean readOnly, boolean enabled, boolean isPassword, v4.i0 offsetMapping, c2 manager, ImeOptions imeOptions, l3.d0 focusRequester) {
        boolean z15 = this.enabled;
        boolean z16 = false;
        boolean z17 = z15 && !this.readOnly;
        boolean z18 = this.isPassword;
        ImeOptions imeOptions2 = this.imeOptions;
        c2 c2Var = this.manager;
        if (enabled && !readOnly) {
            z16 = true;
        }
        this.transformedText = transformedText;
        this.value = value;
        this.state = state;
        this.readOnly = readOnly;
        this.enabled = enabled;
        this.offsetMapping = offsetMapping;
        this.manager = manager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        if (enabled != z15 || z16 != z17 || !fr.t.c(imeOptions, imeOptions2) || isPassword != z18 || !z3.h(value.getSelection())) {
            g4.j1.d(this);
        }
        if (fr.t.c(manager, c2Var)) {
            return;
        }
        manager.O0(new er.a() { // from class: x1.i
            @Override // er.a
            public final Object a() {
                return v.U3(this.f216349a);
            }
        });
    }
}
