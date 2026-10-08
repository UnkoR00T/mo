package u70;

import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lu70/c;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "c", "(Z)Z", "a", "Lmx/a;", "()Lmx/a;", "validators_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements hz.a<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Label errorMessage;

    public c(Label label) {
        this.errorMessage = label;
    }

    @Override // hz.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public Label getErrorMessage() {
        return this.errorMessage;
    }

    @Override // hz.a
    public /* bridge */ /* synthetic */ boolean b(Boolean bool) {
        return c(bool.booleanValue());
    }

    public boolean c(boolean value) {
        return value;
    }
}
