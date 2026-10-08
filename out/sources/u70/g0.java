package u70;

import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lu70/g0;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "a", "Lmx/a;", "()Lmx/a;", "validators_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 implements hz.a<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Label errorMessage;

    public g0(Label label) {
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
        return value.length() > 0;
    }
}
