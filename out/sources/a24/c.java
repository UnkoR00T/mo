package a24;

import iy.c0;
import java.util.List;
import java.util.regex.Pattern;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0003\u000b\r\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"La24/c;", "Lj14/b;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "Lj14/b$a;", "params", "Lhz/g;", "c", "(Lj14/b$a;)Lhz/g;", "a", "Lmx/c;", "b", "Lhz/i;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements j14.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f2207c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hz.i validatorTextFactory;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0013¨\u0006\u0015"}, d2 = {"La24/c$a;", "Lhz/a;", "", "<init>", "(La24/c;)V", "", "index", "c", "(I)I", "value", "", "d", "(Ljava/lang/String;)Z", "", "", "a", "Ljava/util/List;", "values", "Lmx/a;", "()Lmx/a;", "errorMessage", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class a implements hz.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<Character> values = pq.v.L0(pq.v.f1(new lr.c('0', '9')), pq.v.f1(new lr.c('A', 'Z')));

        public a() {
        }

        private final int c(int index) {
            switch (index) {
                case 1:
                    return 7;
                case 2:
                    return 3;
                case 3:
                    return 1;
                case 4:
                    return 7;
                case 5:
                    return 3;
                case 6:
                    return 1;
                case 7:
                    return 7;
                case 8:
                    return 3;
                default:
                    return 0;
            }
        }

        @Override // hz.a
        /* JADX INFO: renamed from: a */
        public Label getErrorMessage() {
            return c.this.labelProvider.c(s04.b.f177222l1);
        }

        @Override // hz.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(String value) {
            int i15 = Integer.parseInt(String.valueOf(value.charAt(3)));
            String string = fu.r.N0(value, 3, 4).toString();
            int iC = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < string.length(); i17++) {
                i16++;
                iC += c(i16) * this.values.indexOf(Character.valueOf(string.charAt(i17)));
            }
            return i15 == iC % 10;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La24/c$b;", "", "<init>", "()V", "", "CHECKSUM_INDEX", "I", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(fr.k kVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: a24.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"La24/c$c;", "Lhz/a;", "", "<init>", "(La24/c;)V", "value", "", "c", "(Ljava/lang/String;)Z", "Lmx/a;", "a", "()Lmx/a;", "errorMessage", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class C0028c implements hz.a<String> {
        public C0028c() {
        }

        @Override // hz.a
        /* JADX INFO: renamed from: a */
        public Label getErrorMessage() {
            return c.this.labelProvider.c(s04.b.f177222l1);
        }

        @Override // hz.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean b(String value) {
            return Pattern.compile("^[A-Z]{3}\\d{6}$").matcher(value).matches();
        }
    }

    public c(mx.c cVar, hz.i iVar) {
        this.labelProvider = cVar;
        this.validatorTextFactory = iVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public hz.g a(j14.b.Params params) {
        hz.h hVarA = this.validatorTextFactory.a();
        if (params.getIsRequired() || !fu.r.t0(c0.e(params.getSeriesAndNumber()))) {
            if (params.getIsRequired()) {
                hVarA.M(this.labelProvider.c(s04.b.f177257x0));
            }
            hVarA.g(new C0028c());
            hVarA.g(new a());
        }
        return hVarA.a(c0.e(params.getSeriesAndNumber()));
    }
}
