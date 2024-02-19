package componentBasedConfigation.IocContainer.EX2;


import org.springframework.stereotype.Component;

@Component
class frstClass implements StudentClasses{
    @Override
    public Integer className() {
        return 1;
    }

    @Override
    public String classTeacherName() {
        return "Shivam singh ";
    }

    @Override
    public String classCaption() {
        return "this is the first class";
    }
}