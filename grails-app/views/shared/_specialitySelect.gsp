<g:select name="speciality" from="${registry.Speciality?.values()}"  keys="${registry.Speciality.values()*.name()}"
          optionKey="name" optionValue="${{it.getName()}}" required="" value="${doctorInstance?.speciality?.name()}"/>