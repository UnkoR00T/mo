package v10;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lv10/a;", "Ldz/a;", "<init>", "()V", "Ljava/math/BigDecimal;", "amount", "", "currency", "b", "(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Locale;", "locale", "c", "(Ljava/math/BigDecimal;Ljava/util/Locale;)Ljava/lang/String;", "d", "(Ljava/lang/String;)Ljava/lang/String;", "textformatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements dz.a {
    @Override // dz.a
    public String b(BigDecimal amount, String currency) {
        return dz.a.a(this, amount, null, 2, null) + ' ' + d(currency);
    }

    @Override // dz.a
    public String c(BigDecimal amount, Locale locale) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
        numberInstance.setMinimumFractionDigits(2);
        numberInstance.setMaximumFractionDigits(2);
        return numberInstance.format(amount);
    }

    @Override // dz.a
    public String d(String currency) {
        return Currency.getInstance(currency).getSymbol();
    }
}
