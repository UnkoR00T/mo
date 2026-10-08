package a24;

import mx.Label;
import p071kotlin.Metadata;
import u70.l0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"La24/a;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "allowedCharactersPattern", "<init>", "(Lmx/a;Ljava/lang/String;)V", "value", "", "c", "(Ljava/lang/String;)Z", "b", "Lmx/a;", "a", "()Lmx/a;", "Ljava/lang/String;", "getAllowedCharactersPattern", "()Ljava/lang/String;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements hz.a<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ l0 f2202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Label errorMessage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String allowedCharactersPattern;

    public a(Label label, String str) {
        this.f2202a = new l0(label, new fu.o(str));
        this.errorMessage = label;
        this.allowedCharactersPattern = str;
    }

    @Override // hz.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public Label getErrorMessage() {
        return this.errorMessage;
    }

    @Override // hz.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(String value) {
        return this.f2202a.b(value);
    }
}
