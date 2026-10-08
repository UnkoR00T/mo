package u70;

import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014¨\u0006\u0015"}, d2 = {"Lu70/g;", "Lhz/a;", "", "", "selectedCharCounter", "", "selectedChar", "Lmx/a;", "errorMessage", "<init>", "(ICLmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "a", "I", "b", "C", "Lmx/a;", "()Lmx/a;", "validators_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements hz.a<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int selectedCharCounter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final char selectedChar;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Label errorMessage;

    public g(int i15, char c15, Label label) {
        this.selectedCharCounter = i15;
        this.selectedChar = c15;
        this.errorMessage = label;
    }

    @Override // hz.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public Label getErrorMessage() {
        return this.errorMessage;
    }

    @Override // hz.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(String value) {
        int i15 = 0;
        for (int i16 = 0; i16 < value.length(); i16++) {
            if (value.charAt(i16) == this.selectedChar) {
                i15++;
            }
        }
        return i15 == this.selectedCharCounter;
    }
}
