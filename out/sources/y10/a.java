package y10;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import dz.d;
import fr.k;
import java.util.List;
import oq.r;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ly10/a;", "Ldz/d;", "<init>", "()V", "", "number", "", "a", "(I)Ljava/lang/String;", "textformatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C5957a f223141a = new C5957a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<Integer> f223142b = v.q(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f223143c = v.q("M", "CM", ip.a.f96138c, "CD", "C", "XC", i.f37094u, "XL", "X", "IX", "V", "IV", "I");

    /* JADX INFO: renamed from: y10.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Ly10/a$a;", "", "<init>", "()V", "", "", "ARABIC_NUMBERS", "Ljava/util/List;", "", "ROMAN_NUMBERS", "textformatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class C5957a {
        public /* synthetic */ C5957a(k kVar) {
            this();
        }

        private C5957a() {
        }
    }

    @Override // dz.d
    public String a(int number) {
        if (1 > number || number >= 4000) {
            return null;
        }
        String str = "";
        for (r rVar : v.p1(f223142b, f223143c)) {
            int iIntValue = ((Number) rVar.a()).intValue();
            str = str + fu.r.L((String) rVar.b(), number / iIntValue);
            number %= iIntValue;
        }
        return str;
    }
}
