package v4;

import java.io.IOException;
import java.util.List;
import p071kotlin.Metadata;
import q4.a4;
import q4.z3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R$\u0010 \u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lv4/m;", "", "<init>", "()V", "", "Lv4/j;", "editCommands", "failedCommand", "", "c", "(Ljava/util/List;Lv4/j;)Ljava/lang/String;", "f", "(Lv4/j;)Ljava/lang/String;", "Lv4/t0;", "value", "Lv4/b1;", "textInputSession", "Loq/i0;", "e", "(Lv4/t0;Lv4/b1;)V", "b", "(Ljava/util/List;)Lv4/t0;", "g", "()Lv4/t0;", "a", "Lv4/t0;", "getMBufferState$ui_text", "mBufferState", "Lv4/n;", "Lv4/n;", "getMBuffer$ui_text", "()Lv4/n;", "mBuffer", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue mBufferState = new TextFieldValue(q4.g.f(), z3.INSTANCE.a(), (z3) null, (fr.k) null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private n mBuffer = new n(this.mBufferState.getText(), this.mBufferState.getSelection(), null);

    private final String c(List<? extends j> editCommands, final j failedCommand) throws IOException {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.h() + ", composition=" + this.mBuffer.d() + ", selection=" + ((Object) z3.q(this.mBuffer.i())) + "):");
        sb5.append('\n');
        pq.g0.s0(editCommands, sb5, (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new er.l() { // from class: v4.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.d(failedCommand, this, (j) obj);
            }
        });
        return sb5.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence d(j jVar, m mVar, j jVar2) {
        return (jVar == jVar2 ? " > " : "   ") + mVar.f(jVar2);
    }

    private final String f(j jVar) {
        if (jVar instanceof CommitTextCommand) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) jVar;
            sb5.append(commitTextCommand.c().length());
            sb5.append(", newCursorPosition=");
            sb5.append(commitTextCommand.getNewCursorPosition());
            sb5.append(')');
            return sb5.toString();
        }
        if (jVar instanceof SetComposingTextCommand) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) jVar;
            sb6.append(setComposingTextCommand.c().length());
            sb6.append(", newCursorPosition=");
            sb6.append(setComposingTextCommand.getNewCursorPosition());
            sb6.append(')');
            return sb6.toString();
        }
        if (jVar instanceof SetComposingRegionCommand) {
            return ((SetComposingRegionCommand) jVar).toString();
        }
        if (jVar instanceof DeleteSurroundingTextCommand) {
            return ((DeleteSurroundingTextCommand) jVar).toString();
        }
        if (jVar instanceof DeleteSurroundingTextInCodePointsCommand) {
            return ((DeleteSurroundingTextInCodePointsCommand) jVar).toString();
        }
        if (jVar instanceof SetSelectionCommand) {
            return ((SetSelectionCommand) jVar).toString();
        }
        if (jVar instanceof p) {
            return ((p) jVar).toString();
        }
        if (jVar instanceof a) {
            return ((a) jVar).toString();
        }
        if (jVar instanceof b0) {
            return ((b0) jVar).toString();
        }
        if (jVar instanceof g) {
            return ((g) jVar).toString();
        }
        StringBuilder sb7 = new StringBuilder();
        sb7.append("Unknown EditCommand: ");
        String strD = fr.q0.c(jVar.getClass()).D();
        if (strD == null) {
            strD = "{anonymous EditCommand}";
        }
        sb7.append(strD);
        return sb7.toString();
    }

    public final TextFieldValue b(List<? extends j> editCommands) {
        j jVar = null;
        try {
            int size = editCommands.size();
            int i15 = 0;
            j jVar2 = null;
            while (i15 < size) {
                try {
                    j jVar3 = editCommands.get(i15);
                    try {
                        jVar3.a(this.mBuffer);
                        i15++;
                        jVar2 = jVar3;
                    } catch (Exception e15) {
                        e = e15;
                        jVar = jVar3;
                        throw new RuntimeException(c(editCommands, jVar), e);
                    }
                } catch (Exception e16) {
                    e = e16;
                    jVar = jVar2;
                }
            }
            q4.e eVarS = this.mBuffer.s();
            long jI = this.mBuffer.i();
            z3 z3VarB = z3.b(jI);
            z3VarB.getPackedValue();
            z3 z3Var = z3.m(this.mBufferState.getSelection()) ? null : z3VarB;
            TextFieldValue textFieldValue = new TextFieldValue(eVarS, z3Var != null ? z3Var.getPackedValue() : a4.b(z3.k(jI), z3.l(jI)), this.mBuffer.d(), (fr.k) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e17) {
            e = e17;
        }
    }

    public final void e(TextFieldValue value, b1 textInputSession) {
        boolean zC = fr.t.c(value.getComposition(), this.mBuffer.d());
        boolean z15 = true;
        boolean z16 = false;
        if (!fr.t.c(this.mBufferState.getText().getText(), value.getText().getText())) {
            this.mBuffer = new n(value.getText(), value.getSelection(), null);
        } else if (z3.g(this.mBufferState.getSelection(), value.getSelection())) {
            z15 = false;
        } else {
            this.mBuffer.p(z3.l(value.getSelection()), z3.k(value.getSelection()));
            z16 = true;
            z15 = false;
        }
        if (value.getComposition() == null) {
            this.mBuffer.a();
        } else if (!z3.h(value.getComposition().getPackedValue())) {
            this.mBuffer.n(z3.l(value.getComposition().getPackedValue()), z3.k(value.getComposition().getPackedValue()));
        }
        if (z15 || (!z16 && !zC)) {
            this.mBuffer.a();
            value = TextFieldValue.i(value, null, 0L, null, 3, null);
        }
        TextFieldValue textFieldValue = this.mBufferState;
        this.mBufferState = value;
        if (textInputSession != null) {
            textInputSession.d(textFieldValue, value);
        }
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextFieldValue getMBufferState() {
        return this.mBufferState;
    }
}
