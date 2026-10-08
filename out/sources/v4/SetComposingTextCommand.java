package v4;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: v4.p0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lv4/p0;", "Lv4/j;", "Lq4/e;", "annotatedString", "", "newCursorPosition", "<init>", "(Lq4/e;I)V", "", "text", "(Ljava/lang/String;I)V", "Lv4/n;", "buffer", "Loq/i0;", "a", "(Lv4/n;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lq4/e;", "getAnnotatedString", "()Lq4/e;", "b", "I", "c", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SetComposingTextCommand implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q4.e annotatedString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int newCursorPosition;

    public SetComposingTextCommand(q4.e eVar, int i15) {
        this.annotatedString = eVar;
        this.newCursorPosition = i15;
    }

    @Override // v4.j
    public void a(n buffer) {
        if (buffer.l()) {
            int compositionStart = buffer.getCompositionStart();
            buffer.m(buffer.getCompositionStart(), buffer.getCompositionEnd(), c());
            if (c().length() > 0) {
                buffer.n(compositionStart, c().length() + compositionStart);
            }
        } else {
            int selectionStart = buffer.getSelectionStart();
            buffer.m(buffer.getSelectionStart(), buffer.getSelectionEnd(), c());
            if (c().length() > 0) {
                buffer.n(selectionStart, c().length() + selectionStart);
            }
        }
        int iG = buffer.g();
        int i15 = this.newCursorPosition;
        buffer.o(lr.m.n(i15 > 0 ? (iG + i15) - 1 : (iG + i15) - c().length(), 0, buffer.h()));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    public final String c() {
        return this.annotatedString.getText();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetComposingTextCommand)) {
            return false;
        }
        SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) other;
        return fr.t.c(c(), setComposingTextCommand.c()) && this.newCursorPosition == setComposingTextCommand.newCursorPosition;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.newCursorPosition;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + c() + "', newCursorPosition=" + this.newCursorPosition + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SetComposingTextCommand(String str, int i15) {
        this(new q4.e(str, null, 2, 0 == true ? 1 : 0), i15);
    }
}
