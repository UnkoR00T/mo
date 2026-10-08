package q14;

import hz.g;
import hz.h;
import iy.c0;
import java.util.regex.Pattern;
import mx.Label;
import p071kotlin.Metadata;
import tq.e;
import vq.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lq14/a;", "Lc14/a;", "Lhz/h;", "textValidator", "<init>", "(Lhz/h;)V", "", "email", "", "e", "(Ljava/lang/String;)Z", "Lc14/a$a;", "params", "d", "(Lc14/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lhz/h;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@oq.a
public final class a implements c14.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h textValidator;

    /* JADX INFO: renamed from: q14.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lq14/a$a;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "a", "Lmx/a;", "()Lmx/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class C4068a implements hz.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Label errorMessage;

        public C4068a(Label label) {
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
            return !Pattern.compile("(^\\.|\\.{2,}|\\.@|@\\.|@.*\\.$)").matcher(value).find();
        }
    }

    public a(h hVar) {
        this.textValidator = hVar;
    }

    private final boolean e(String email) {
        h hVar = this.textValidator;
        Label.Companion companion = Label.INSTANCE;
        h hVarA = hVar.A(companion.c());
        hVarA.g(new C4068a(companion.c()));
        return hVarA.a(email) instanceof g.b;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(c14.a.Params params, e<? super Boolean> eVar) {
        String strE = c0.e(params.getEmail());
        boolean z15 = false;
        if ((e(strE) || !params.getWasEmailVerified()) && ((strE.length() >= 6 || !params.getWasEmailVerified()) && strE.length() <= 64)) {
            z15 = true;
        }
        return b.a(z15);
    }
}
