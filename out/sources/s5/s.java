package s5;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CharSequence f177965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IconCompat f177966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f177967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f177968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f177969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f177970f;

    static class a {
        static Person a(s sVar) {
            return new Person.Builder().setName(sVar.c()).setIcon(sVar.a() != null ? sVar.a().n() : null).setUri(sVar.d()).setKey(sVar.b()).setBot(sVar.e()).setImportant(sVar.f()).build();
        }
    }

    public IconCompat a() {
        return this.f177966b;
    }

    public String b() {
        return this.f177968d;
    }

    public CharSequence c() {
        return this.f177965a;
    }

    public String d() {
        return this.f177967c;
    }

    public boolean e() {
        return this.f177969e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        String strB = b();
        String strB2 = sVar.b();
        if (strB == null && strB2 == null) {
            return Objects.equals(Objects.toString(c()), Objects.toString(sVar.c())) && Objects.equals(d(), sVar.d()) && Boolean.valueOf(e()).equals(Boolean.valueOf(sVar.e())) && Boolean.valueOf(f()).equals(Boolean.valueOf(sVar.f()));
        }
        return Objects.equals(strB, strB2);
    }

    public boolean f() {
        return this.f177970f;
    }

    public String g() {
        String str = this.f177967c;
        if (str != null) {
            return str;
        }
        if (this.f177965a == null) {
            return "";
        }
        return "name:" + ((Object) this.f177965a);
    }

    public Person h() {
        return a.a(this);
    }

    public int hashCode() {
        String strB = b();
        return strB != null ? strB.hashCode() : Objects.hash(c(), d(), Boolean.valueOf(e()), Boolean.valueOf(f()));
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f177965a);
        IconCompat iconCompat = this.f177966b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.m() : null);
        bundle.putString("uri", this.f177967c);
        bundle.putString("key", this.f177968d);
        bundle.putBoolean("isBot", this.f177969e);
        bundle.putBoolean("isImportant", this.f177970f);
        return bundle;
    }
}
